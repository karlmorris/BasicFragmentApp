package edu.temple.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = RandomImageFragment.newInstance(R.drawable.cat1)
        val fragment2 = RandomImageFragment.newInstance(R.drawable.cat2)

        supportFragmentManager.beginTransaction()
            .add(R.id.container1, fragment1)
            .add(R.id.container2, fragment2)
            .commit()

        findViewById<Button>(R.id.changeButton).setOnClickListener {
            fragment1.changeImage()
        }

        //fragment1.changeImage(R.drawable.cat1)
        //fragment2.changeImage(R.drawable.cat2)
    }
}