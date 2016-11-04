//Filtering
val nameList = List("Test.scala", "Main.java", "App.scala")

for (scalaFile <- nameList if scalaFile.endsWith("scala"))
  println(scalaFile)

for (specificFile <- nameList
     if specificFile.endsWith("scala")
     if specificFile.startsWith("A"))
  println(specificFile)

//Nested iteration
for {scalaFile <- nameList
     if scalaFile.endsWith("scala")
     letter <- scalaFile.toCharArray}
  println(scalaFile + ": " + letter)

//Yield
val scalaFiles = for {scalaFile <- nameList
if scalaFile.endsWith("scala")} yield scalaFile