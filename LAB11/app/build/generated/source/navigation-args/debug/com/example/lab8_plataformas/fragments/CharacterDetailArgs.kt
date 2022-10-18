package com.example.lab8_plataformas.fragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class CharacterDetailArgs(
  public val characterID: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("characterID", this.characterID)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("characterID", this.characterID)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CharacterDetailArgs {
      bundle.setClassLoader(CharacterDetailArgs::class.java.classLoader)
      val __characterID : Int
      if (bundle.containsKey("characterID")) {
        __characterID = bundle.getInt("characterID")
      } else {
        throw IllegalArgumentException("Required argument \"characterID\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailArgs(__characterID)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CharacterDetailArgs {
      val __characterID : Int?
      if (savedStateHandle.contains("characterID")) {
        __characterID = savedStateHandle["characterID"]
        if (__characterID == null) {
          throw IllegalArgumentException("Argument \"characterID\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"characterID\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailArgs(__characterID)
    }
  }
}
