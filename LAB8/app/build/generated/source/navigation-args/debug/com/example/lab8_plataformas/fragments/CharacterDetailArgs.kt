package com.example.lab8_plataformas.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.lab8_plataformas.database.Character
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class CharacterDetailArgs(
  public val characterInfo: Character
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Character::class.java)) {
      result.putParcelable("characterInfo", this.characterInfo as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Character::class.java)) {
      result.putSerializable("characterInfo", this.characterInfo as Serializable)
    } else {
      throw UnsupportedOperationException(Character::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Character::class.java)) {
      result.set("characterInfo", this.characterInfo as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Character::class.java)) {
      result.set("characterInfo", this.characterInfo as Serializable)
    } else {
      throw UnsupportedOperationException(Character::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): CharacterDetailArgs {
      bundle.setClassLoader(CharacterDetailArgs::class.java.classLoader)
      val __characterInfo : Character?
      if (bundle.containsKey("characterInfo")) {
        if (Parcelable::class.java.isAssignableFrom(Character::class.java) ||
            Serializable::class.java.isAssignableFrom(Character::class.java)) {
          __characterInfo = bundle.get("characterInfo") as Character?
        } else {
          throw UnsupportedOperationException(Character::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__characterInfo == null) {
          throw IllegalArgumentException("Argument \"characterInfo\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"characterInfo\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailArgs(__characterInfo)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CharacterDetailArgs {
      val __characterInfo : Character?
      if (savedStateHandle.contains("characterInfo")) {
        if (Parcelable::class.java.isAssignableFrom(Character::class.java) ||
            Serializable::class.java.isAssignableFrom(Character::class.java)) {
          __characterInfo = savedStateHandle.get<Character?>("characterInfo")
        } else {
          throw UnsupportedOperationException(Character::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__characterInfo == null) {
          throw IllegalArgumentException("Argument \"characterInfo\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"characterInfo\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailArgs(__characterInfo)
    }
  }
}
