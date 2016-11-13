package com.rik.programming.scala.chaptereight

/**
  * Created by riccardocinti on 11/5/16.
  */
object TailRec extends App {

  //Non tail rec
  def boom(x: Int): Int =
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1

  //boom(3) //3 calls to the stack

  //Tail rec
  def bang(x: Int): Int =
    if(x == 0) throw new Exception("bang!")
    else bang(x - 1)

  bang(3) //same call to the stack

}
