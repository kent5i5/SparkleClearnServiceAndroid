package com.yinkin.sparkle.ui

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.yinkin.sparkle.R

class SettingsFragment : PreferenceFragmentCompat() {


    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)

    }
}
