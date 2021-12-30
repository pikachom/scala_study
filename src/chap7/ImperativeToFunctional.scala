package chap7

class ImperativeToFunctional {
  //imperative
  def printMultiTable(): Unit = {
    var i = 1
    while (i <= 10) {
      var j = 1
      while (j <= 10) {
        val prod = (i * j).toString
        var k = prod.length
        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      println()
      i += 1
    }
  }
  //functional
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield{
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  def makeRow(row: Int) = makeRowSeq(row).mkString

  def multiTable() = {
    val tableSeq = {
      for(row <- 1 to 10)
        yield makeRow(row)
    }
    tableSeq.mkString("\n")
  }
}
object ImperativeToFunctional{
  def main(args: Array[String]): Unit = {
    val test = new ImperativeToFunctional
    test.printMultiTable()
    println("\n")
    println(test.multiTable())

    def twice(op: Double => Double, x: Double) = op(op(x))
  }
}
