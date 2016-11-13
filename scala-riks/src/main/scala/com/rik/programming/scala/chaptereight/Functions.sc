//literal function plays
val test = "test"
val diminutive = (s: String) => s + "ino"
println(diminutive(test))
val stringList = List("test", "fast", "cast")
stringList.foreach(s => println(diminutive(s)))

//placeholders
val someNumbers = List(1, 2, 3, 4, 5, 16)
println(someNumbers.filter(_ > 10))
val f = (_: Int) + (_: Int) //you need to infer the type here
println(f(1, 2))

//partial functions
someNumbers.foreach(println _) //the placeholder can be omitted here
def sum(a: Int, b: Int, c: Int): Int = a + b + c
val a = sum _
a(1, 2, 3)
val b = sum(1, _: Int, 3)
b(2)

//closures
val more = 4
val closed = (x: Int) => x + 1
val closure = (x: Int) => x + more //depends on more, which needs to be get to CLOSE the function

closure(4)

//in this case the value for add changes during the closure
var add = 0
val g = (x: Int) => add = x + add
val h = (x: Int) => {
  g(x);
  println(add)
}
h(100)

//Special functions calls
def repeated(xs: Int*) =
  xs.foreach(println)
repeated(2)
repeated(2, 3)
repeated(2, 3, 4)

val intArray = Array(1, 2, 3)
repeated(intArray: _*) //notation used to pass an array as argument

//Named arguments
def speed(distance: Float, time: Float) = distance / time
speed(100, 10)

speed(distance = 100, time = 10)
speed(time = 10, distance = 100)

//Default parameters
def printTime(out: java.io.PrintStream = Console.out) =
  out.println("time = " + System.currentTimeMillis())

printTime()
printTime(Console.err)

//Named + Default
def printDefaultSum(x1: Int = 1, x2: Int = 2) = println(x1 + x2)
printDefaultSum()
printDefaultSum(x1 = 2)
printDefaultSum(x2 = 4)