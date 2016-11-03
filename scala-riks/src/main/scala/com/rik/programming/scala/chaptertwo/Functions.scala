package com.rik.programming.scala.chaptertwo

import scala.annotation.tailrec
import scala.io.{BufferedSource, Source}

/**
  * Created by riccardocinti on 10/15/16.
  */
object Functions {
  def main(args: Array[String]) {

    prettyPrint("Sum: ", sum(1,2))

    prettyPrint("Recursive factorial: ", recursiveFactorial(3))

    prettyPrint("Tail recursive factorial: ", tailRecursiveFactorial(3))

    prettyPrint("Sum for loop: ", sumForLoop(List(1,2,3)))

    println("While + file reading: ")
    whileSideEffect(readFile("./README.md"))
    println()

    println("Function literal: ")
    List(1,2,3).foreach(number => println(number * 2))
    println()

    println("Fibonacci: ")
    for (i <- 1 to 10)
      println(fibonacci(i))

    println("Fibonacci tail: ")
    for (i <- 1 to 10)
      println(tailFibonacci(i))
  }

  def sum (x: Int, y: Int): Int = {
    x + y
  }

  def readFile (filePath: String): BufferedSource = {
    val source = Source.fromFile(filePath)
    source
  }

  //function with side effects
  def whileSideEffect(strings: BufferedSource) = {
    val fileContent = strings.getLines()
    while (fileContent.hasNext)
      //first side effect
      println(fileContent.next())
    //second side effect
    strings.close()
  }

  def sumForLoop(numbers: List[Int]): Int = {
    var sum = 0
    for (number <- numbers)
      sum += number
    sum
  }

  def recursiveFactorial(x: Int): Int = {
    if(x < 1 ) 1 else x * recursiveFactorial(x-1)
  }

  def tailRecursiveFactorial(x: Int): Int = {
    @tailrec
    def factorialIncrementation(acc: Int, x: Int): Int = {
      if(x < 1) acc else factorialIncrementation(acc * x, x - 1)
    }
    factorialIncrementation(1, x)
  }

  def fibonacci(x: Int): Int = {
    if(x == 1 || x == 2) 1 else fibonacci(x - 1) + fibonacci(x - 2)
  }

  def tailFibonacci(x: Int) = {
    @tailrec
    def adder(p: Int, c: Int, counter: Int): Int = {
      if(counter <= 2 ) c else adder(c, p + c, counter - 1)
    }
    adder(1, 1, x)
  }

  //side effects
  def prettyPrint(text: String, functionResult: Any): Unit ={
    print(text)
    println(functionResult)
    println()
  }
}
