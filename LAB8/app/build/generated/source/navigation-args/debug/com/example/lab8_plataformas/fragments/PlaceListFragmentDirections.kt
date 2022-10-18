package com.example.lab8_plataformas.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.lab8_plataformas.R
import com.example.lab8_plataformas.database.Character
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class PlaceListFragmentDirections private constructor() {
  private data class ActionPlaceListFragmentToPlaceDetailsFragment(
    public val characterInfo: Character
  ) : NavDirections {
    public override val actionId: Int = R.id.action_placeListFragment_to_placeDetailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionPlaceListFragmentToPlaceDetailsFragment(characterInfo: Character):
        NavDirections = ActionPlaceListFragmentToPlaceDetailsFragment(characterInfo)
  }
}
