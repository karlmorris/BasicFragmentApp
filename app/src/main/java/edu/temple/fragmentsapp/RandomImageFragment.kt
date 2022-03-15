package edu.temple.fragmentsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import java.util.*

class RandomImageFragment : Fragment() {

    private var imageView : ImageView? = null
    private var imageResource : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.run{
            imageResource = getInt("imageResource")
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val layout = inflater.inflate(R.layout.fragment_random_image, container, false)

        imageView = layout.findViewById<ImageView>(R.id.imageView)

        imageView!!.setOnClickListener {
            changeImage()
        }


        return layout

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageResource?.run{
            changeImage(this)
        }
    }


    fun changeImage() {
        imageView!!.setImageResource(
            if (Random().nextInt(2) > 0 ) R.drawable.cat1 else R.drawable.cat2
        )
    }

    fun changeImage(resourceId: Int) {
        imageView!!.setImageResource(resourceId)
    }


    companion object {
        fun newInstance(resourceId: Int) : RandomImageFragment {
            val fragment = RandomImageFragment()
            val bundle = Bundle()
            bundle.putInt("imageResource", resourceId)
            fragment.arguments = bundle
            return fragment
        }
    }

}