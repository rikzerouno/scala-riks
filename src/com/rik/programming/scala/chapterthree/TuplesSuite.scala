package com.rik.programming.scala.chapterthree

/**
  * Created by riccardocinti on 10/16/16.
  */
object TuplesSuite {
  def main(args: Array[String]) {
    print("First tuple declaration: ")
    val firstTuple = (22, 33)
    println(firstTuple._1)

    print("Second tuple declaration: ")
    val secondTuple = returnTuple("Ciao")
    println(secondTuple)
  }

  //returns a tuple with a string and its length
  def returnTuple(s: String) = {
    (s, s.length)
  }
}
