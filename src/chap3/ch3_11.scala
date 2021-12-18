package chap3

import scala.io.Source

object ch3_11 {
  def widthOfLength(s: String) = s.length.toString.length

  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("please enter file name: ")
    // stdin example : src/chap3/ch3_11.scala

    if(input.length > 0){
      val lines = Source.fromFile(input).getLines().toList

      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
      )
      val maxWidth = widthOfLength(longestLine)

      for(line <- lines){
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + " | " + line)
      }
    }
    else
      Console.err.println("Please enter filename")
  }

}
