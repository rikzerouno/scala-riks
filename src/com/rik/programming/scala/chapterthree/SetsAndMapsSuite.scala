package com.rik.programming.scala.chapterthree

/**
  * Created by riccardocinti on 10/16/16.
  */
object SetsAndMapsSuite {
  def main(args: Array[String]) {
    println("Mutable set declaration")
    val mutableSet = scala.collection.mutable.Set(1,2,3)
    mutableSet += 4
    println(mutableSet)

    println("Immutable set declaration")
    var immutableSet = Set(1,2,3)
    immutableSet += 4
    println(immutableSet)

    println("Mutable map declaration")
    val mutableMap = scala.collection.mutable.Map[Int, String]()
    mutableMap += (1 -> "Rome")
    mutableMap += (2 -> "Paris")
    mutableMap += (3 -> "London")
    println("Which is the best city in the world? " + mutableMap(1))

    //Same story as immutable sets, I have to use var if I want to add more keys
    println("Immutable map declaration")
    var immutableMap = Map(1 -> "Hello", 2 -> "World")
    immutableMap += (3 -> "!")
    println(immutableMap)
  }
}
