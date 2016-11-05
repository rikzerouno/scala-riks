package com.rik.functional.scala.chaptertwo.exercise

import scala.annotation.tailrec

/**
  * Created by riccardocinti on 11/4/16.
  */
object Excercises {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    @tailrec
    def loop(n: Int): Boolean = {
      if (n + 1 >= as.length) true
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    }

    loop(0)
  }

  def main(args: Array[String]) {
    val a = Array("bazz", "cazz", "azz")

    println(isSorted(a, (s1: String, s2: String) => s1.compareTo(s2) < 0))

    println(isSorted(Array(1, 2, 3), (n1: Int, n2: Int) => n1 < n2))
  }

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = a => b => f(a, b)

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a,b) => f(a)(b)

  def compose[A,B,C](f: B => C, g: A => B): A => C = a => f(g(a))

}
