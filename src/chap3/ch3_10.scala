package chap3

import scala.io.Source

object ch3_10 {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("please enter file name: ")
    // example : src/chap3/ch3_10.scala

    if(input.length > 0){
      for (line <- Source.fromFile(input).getLines())
        println(line.length + " " + line)
    }
    else
      Console.err.println("Please enter filename")
  }

}
