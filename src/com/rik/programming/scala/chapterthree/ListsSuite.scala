package com.rik.programming.scala.chapterthree

/**
  * Created by riccardocinti on 10/16/16.
  */
object ListsSuite {

  def main(args: Array[String]) {

    println("First list declaration")
    val firstList = List(1, 2, 3)
    println(firstList(1))

    println("\nConcatenated list")
    val listToConcatenate = List(4, 5)
    (firstList ::: listToConcatenate).foreach(println)

    println("\nSecond list declaration with cons")
    val secondList = 1 :: 2 :: 3 :: Nil
    secondList.foreach(println)

    println("\nNew list with 4 put at the top, reversed and then printed")
    //this creates a new list too, like the Arrays
    //actually print it in the proper order looks a bit counter-intuitive
    (4 :: secondList.reverse).reverse.foreach(i => println(i))

    println("\nCounting difference between :+ and ::")
    val thirdList = 1 :: 2 :: 3 :: Nil
    print(":+ ")
    time(thirdList :+ 4)
    print(":: ")
    time(4 :: thirdList)

    println("\nOther methods with List")
    print("Count: ")
    val stringList = List("This", "is", "a", "test", "for", "lists")
    println(stringList.count(s => s.length == 4))
    print("Drop: ")
    println(stringList.drop(2))
    print("Filter: ")
    println(stringList.filter(s => s.length == 4))
    print("Map: ")
    println(stringList.map(s => s + "_ZAO"))
    print("SortWith: ")
    println(stringList.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))

    time(thirdList.sortWith((x, y) => x > y))
  }

  /**
    * Nice function to calculate time copied from here:
    * http://biercoff.com/easily-measuring-code-execution-time-in-scala/
    */
  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }
}
