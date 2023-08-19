package com.example.test

fun main()
{
    var value:Int=3
    when(value)
    {
        1->println("Hello Obama")
        2->println("Hello Putin")
        3->println("Hello PThuy")
        4->println("Hello Kim Jong Un")
        else-> println("Hello Everyone!")
    }
// dạng when với kiểm tra biểu thức
    var x:Int=6
    var kq=when(x)
    {
        in 1..10->x+22
        in 20..30->x-1000
        else -> x
    }
    println(kq)
    // dạng when với if_else
    when
    {
        x%2==0-> println("X là số chẵn")
        x%2!=0->println("X là số lẻ")
    }


}