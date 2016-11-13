package com.rik.programming.scala.chapterten

/**
  * Created by riccardocinti on 11/6/16.
  */
class LineElement (s: String) extends ArrayElement(Array(s)){
  override def width = s.length
  override def height = 1
}
