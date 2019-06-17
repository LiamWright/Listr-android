package dev.writech.listr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var Meals = arrayOf("one","two","three","four")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickMealButton.setOnClickListener{
            Log.d("Info","Hello")
            //Pick from array/List
            //Display


        }


    }

}
