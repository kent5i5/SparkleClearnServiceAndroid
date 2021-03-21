package com.yinkin.sparkle.ui

import android.content.Context
//import android.support.v7.preference.Preference
//import android.support.v7.preference.PreferenceViewHolder
import android.util.AttributeSet
import android.widget.Button
import androidx.navigation.Navigation
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import com.yinkin.sparkle.R

//import kotlinx.android.synthetic.main.custom_preference_layout.view.*

class CustomPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : Preference(context, attrs, defStyleAttr) {
    private lateinit var titleView: Button

    init {
        widgetLayoutResource = R.layout.fragment_preference_buttons
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        with(holder.itemView) {
            // do the view initialization here...
            var preSignInButton = this.findViewById<Button>(R.id.preSignInButton)
            preSignInButton .setOnClickListener(Navigation.createNavigateOnClickListener(R.id.loginFragment))
            //textView.text = "Another Text"
        }
    }


}