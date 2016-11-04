import java.io.{FileNotFoundException, FileReader}

try {
  val f = new FileReader("input.txt")
} catch {
  case ex: FileNotFoundException => println("File not found!")
}