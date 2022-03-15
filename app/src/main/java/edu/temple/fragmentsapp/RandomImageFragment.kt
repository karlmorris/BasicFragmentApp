package edu.temple.fragmentsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import java.util.*

class RandomImageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val layout = inflater.inflate(R.layout.fragment_random_image, container, false)

        val imageView = layout.findViewById<ImageView>(R.id.imageView)

        imageView.setOnClickListener {

            imageView.setImageResource(
                if (Random().nextInt(2) > 0 ) R.drawable.cat1 else R.drawable.cat2
            )

        }



        return layout

    }

}