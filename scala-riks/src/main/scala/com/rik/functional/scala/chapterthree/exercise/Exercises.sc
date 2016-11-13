import com.rik.functional.scala.chapterthree.book._

val x = List(1,2,3,4,5) match {
  case Cons(x, Cons(2, Cons(4, _))) => x
  case Nil => 42
  case _ => 101
  case Cons(h, t) => h + List.sum(t)
  case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
}

val y = List.tail(List())

List.setHead(4, Nil)



