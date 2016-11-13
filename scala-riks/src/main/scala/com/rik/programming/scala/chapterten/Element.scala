package com.rik.programming.scala.chapterten

/**
  * Created by riccardocinti on 11/6/16.
  */

import Element.elem

abstract class Element {
  def contents: Array[String]

  def height: Int = contents.length

  def width: Int =  contents(0).length

  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents)
  }

  def beside(that: Element): Element = {
    /* IMPERATIVE MODE
    val contents = new Array[String](this.contents.length)
    for (i <- 0 until this.contents.length)
      contents(i) = this.contents(i) + that.contents(i)
    new ArrayElement((contents))
     */
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(
      for (
        (line1, line2) <- this1.contents zip that1.contents
      ) yield line1 + line2)
  }

  def widen(w: Int): Element = {
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }
  }

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }

  override def toString = contents mkString "\n"

}

object Element {
  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  def elem(char: Char, width: Int, height: Int): Element = new UniformElement(char, width, height)

  def elem(line: String): Element = new LineElement(line)
}
