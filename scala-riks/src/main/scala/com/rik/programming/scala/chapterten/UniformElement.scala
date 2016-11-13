package com.rik.programming.scala.chapterten

/**
  * Created by riccardocinti on 11/6/16.
  */
class UniformElement (ch: Char,
                      override val width: Int,
                      override val height: Int
                     )extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}
