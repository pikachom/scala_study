package chap4

import chap4.ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args) {
      println(arg +": "+ calculate(arg))
    }
  }
}
