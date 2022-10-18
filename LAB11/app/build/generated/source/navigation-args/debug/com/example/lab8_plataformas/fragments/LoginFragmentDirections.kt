package com.example.lab8_plataformas.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.lab8_plataformas.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToPlaceListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_placeListFragment)
  }
}
