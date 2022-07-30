package com.rsk


fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5, 6)
    val i = first(ints) { i -> i == 3 }

    println(i)
}

inline fun <T> first( items: List<T>, predicate: (T) -> Boolean): T{
//    return the first item in the list that match the predicate
    for(item in items){
        if(predicate(item)) return item
    }

    throw java.lang.Exception()
}