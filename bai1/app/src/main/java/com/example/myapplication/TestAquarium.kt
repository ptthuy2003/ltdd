package com.example.myapplication


    fun buildAquarium(){
        val myAquarium= Aquarium()
        myAquarium.printsize()
        myAquarium.height= 68
        myAquarium.printsize()
    }
    fun main(){
        buildAquarium()
    }

