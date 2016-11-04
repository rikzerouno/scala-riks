val arg = "pim"

arg match {
  case "test" => println("pepper")
  case "chips" => println("meh")
  case _ => println("cos?")
}

val toPrint = arg match {
  case "test" => 1
  case "pim" => 2
  case _ => 0
}

println(toPrint)