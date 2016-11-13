package com.rik.programming.scala.chapternine

import java.io.File

/**
  * Created by riccardocinti on 11/6/16.
  */
object FileMatcher {

  private def filesHere = (new File(".")).listFiles()

  def filesMatching(query: String, matcher: (String, String) => Boolean) =
    for (file <- filesHere; if matcher(file.getName, query))
      yield file

}
