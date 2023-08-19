package com.example.test

fun main(){
    val numberOfStudents = 101
    if (numberOfStudents in 1..100) {
        println(numberOfStudents)
    }else{
        println("No never !")
    }

}