package chap3

object ch3_3 {
  def main(args: Array[String]): Unit = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo +" and " + threeFour +" were not mutated.")
    println("Thus, " + oneTwoThreeFour +" is a new list")

    val twoThree = List(2, 3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)
  }

}
