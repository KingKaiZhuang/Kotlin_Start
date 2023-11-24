package com.example.myapplication

fun main(){
    var call = Laptop().video();
    print(call)
}

class Laptop():Telephone{
    override  fun call() {
        println("筆電 call")
    }

    override fun hangout() {
        println("筆電　hangout")
    }

    override fun video() {
        println("筆電 video")
    }
}

interface Telephone{
    fun call()
    fun hangout()
    fun video()
}
