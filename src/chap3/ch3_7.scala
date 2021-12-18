package chap3

object ch3_7 {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap.mkString("\n"))
    println(treasureMap.getClass)

    val romanNumeral = scala.collection.immutable.Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(romanNumeral(4))
    println((romanNumeral.getClass))

  }

}
