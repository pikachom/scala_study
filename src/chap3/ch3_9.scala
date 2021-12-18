package chap3

object ch3_9 {
  def main(args: Array[String]): Unit = {
    // Unit result type 은 피하는것이 좋다
    def printArgs(args: Array[String]) = {
      args.foreach(println)
    }

    def formatArgs(args: Array[String]) = args.mkString("\n")
    val res = formatArgs(Array("zero", "one", "two"))
    assert(res == "zero\none\ntwo")
  }

}
