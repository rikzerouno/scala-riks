package com.rik.functional.scala.chaptertwo.book

import scala.annotation.tailrec

/**
  * Created by riccardocinti on 11/4/16.
  */
object PolyFunc {

  def findFirst(ss: Array[String], key: String): Int = {
    @tailrec
    def loop(n: Int): Int =
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)

    loop(0)
  }

  def findFirstGeneric[A](as: Array[A], p: A => Boolean): Int = {
    @tailrec
    def loop(n:Int): Int = {
      if (n >= as.length) -1
      else if(p(as(n))) n
      else loop(n + 1)
    }
    loop(0)
  }

  def test(s: String): Boolean = {
    s == "meh"
  }

  def main(args: Array[String]) {
    val a = Array("ciao", "meh")
    println(findFirst(a, "ciao"))
    println(findFirstGeneric(a, test))
  }
}

