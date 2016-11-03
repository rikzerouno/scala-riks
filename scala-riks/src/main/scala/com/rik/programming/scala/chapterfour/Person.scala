package com.rik.programming.scala.chapterfour

/**
  * Created by riccardocinti on 10/17/16.
  */
class Person {
  private var name = ""
  private val age = 29

  //it's a procedure
  def greetings(s: String) = {
    name = s
    println("Hi, my name is " + s + ". I'm " + age)
  }
}
