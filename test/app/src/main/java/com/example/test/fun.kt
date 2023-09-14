package com.example.test

fun abc (str: String){
    println("test ne"+ str)
}
fun soThuc(x:Int) : Int{
  return x+4
}
fun u(name: String) : Unit{
    println("xin Chao "+ name)
}
fun sum(x: Double, y: Double): Double{
    return x+y
}
val hdhdh= {level: Int -> level/2}


fun main(){
    abc("hihi")
    println(soThuc(5))
    u("Yessor")
    println(sum(3.3,  5.5))
    val n= 30
    println(hdhdh(n))
}
