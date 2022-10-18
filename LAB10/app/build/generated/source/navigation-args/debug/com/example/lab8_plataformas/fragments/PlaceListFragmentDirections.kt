package com.example.lab8_plataformas.fragments

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.lab8_plataformas.R
import kotlin.Int
import kotlin.String

public class PlaceListFragmentDirections private constructor() {
  private data class ActionPlaceListFragmentToPlaceDetailsFragment(
    public val characterID: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_placeListFragment_to_placeDetailsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("characterID", this.characterID)
        return result
      }
  }

  public companion object {
    public fun actionPlaceListFragmentToPlaceDetailsFragment(characterID: String): NavDirections =
        ActionPlaceListFragmentToPlaceDetailsFragment(characterID)

    public fun actionPlaceListFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_placeListFragment_to_loginFragment)
  }
}
