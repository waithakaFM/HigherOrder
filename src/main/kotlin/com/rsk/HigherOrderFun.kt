package com.rsk

// declaring a function
val action = { println("Hello, Kotlin") }
val calc: (Int, Int) -> Int = {x, y -> x * y}

fun main(args: Array<String>) {
    doSomething (action)
}

fun doSomething( func: () -> Unit){
    func()
}