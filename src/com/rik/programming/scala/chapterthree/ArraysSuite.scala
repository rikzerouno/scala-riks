package com.rik.programming.scala.chapterthree

/**
  * Created by riccardocinti on 10/16/16.
  */
object ArraysSuite {

  def main(args: Array[String]) {
    val firstArrayDec = new Array[String](3)
    firstArrayDec(0) = "Hello"
    firstArrayDec(1) = ","
    firstArrayDec(2) = "Scala!"

    for (s <- firstArrayDec)
      print(s)

    println("\nSecond array declaration")
    val secondArrayDec = Array("Hello", ",", "Scala!")
    secondArrayDec.foreach(s => print(s))

    //mutable array
    println("\nThird array")
    val thirdArray = collection.mutable.ArrayBuffer("This ", "is ", "a")
    thirdArray += " test"
    thirdArray.foreach(s => print(s))
    /* I noticed if I didn't use the mutable ArrayBuffer class and tried to add
     * a new field in the array, I didn't get an error. Scala created a new array
     * with the new field with a new reference:
     *
     *  scala> val array = Array(1,2)
     *  array: Array[Int] = Array(1, 2)
     *
     *  scala> array :+ 3
     *  res0: Array[Int] = Array(1, 2, 3)
     *
     * named "res0". So the operator :+ returns a new Array
     */
  }

}
