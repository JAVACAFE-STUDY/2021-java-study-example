package com.javacafe.study.colection_more

fun main() {
    // error!
    // val nullList:List<String> = null
    val list: List<String> = listOf("a", "b", "c")
    println(list)

    // method 존재안함
    // list.add()
    // list.remove(1)

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
    mutableList.add("test")

    println(mutableList)
}
