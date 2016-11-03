package com.rik.programming.scala.chaptersix

/**
  * Created by riccardocinti on 10/31/16.
  */
class Rational(n: Int, d: Int) {
  require(d != 0)

  val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1) //auxiliary constructor

  override def toString = numer + "/" + denom

  def + (that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }

  def * (that: Rational) = new Rational(this.numer * that.numer, this.denom * that.denom)

  private def gcd(a: Int, b: Int): Int = {
    if(b == 0) a else gcd(b, a % b)
  }
}
