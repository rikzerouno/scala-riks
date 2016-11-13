package com.rik.functional.scala.chapterthree.book

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def tail[A](xs: List[A]): List[A] = xs match {
    case Nil => Nil
    case Cons(_, xs) => xs
  }

  def setHead[A](x: A, xs: List[A]) = xs match {
    case Nil => Cons(x, Nil)
    case Cons(_, y) => Cons(x, y)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

}
