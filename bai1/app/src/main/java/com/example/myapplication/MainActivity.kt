package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun buildAquarium(){
            val myAquarium= Aquarium()
            myAquarium.printsize()
            myAquarium.height= 68
            myAquarium.printsize()
        }
        fun main(){
            buildAquarium()
        }

        main()
    }
}