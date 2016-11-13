var more = 1

val f = (x: Int) => x + more

f(1)

more = 99

f(1)

val l = List(-11, -10, -5, 0, 5, 10)

var sum = 0
l.foreach(sum += _)

sum