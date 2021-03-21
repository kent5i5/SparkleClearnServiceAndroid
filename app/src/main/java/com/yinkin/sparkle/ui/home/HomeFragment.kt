package com.yinkin.sparkle.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.yinkin.sparkle.R

class HomeFragment : Fragment() {

  private lateinit var homeViewModel: HomeViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_home, container, false)
    val textView: TextView = root.findViewById(R.id.editTextTextPersonName)
    val imageView5: ImageView = root.findViewById(R.id.imageView5)
    var imageView6: ImageView = root.findViewById(R.id.imageView6)
    homeViewModel.text.observe(viewLifecycleOwner, Observer {
      textView.text = it
    })
    imageView6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.serviceStep1Fragment))
    imageView5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.serviceStep1Fragment))

    // set custom back button
    val callback = requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {

      // navigate to certain destination
      Navigation.findNavController(root).popBackStack(R.id.navigation_home, false)


    }
    return root
  }

}