package chap3

object ch3_1 {
  def main(args: Array[String]): Unit = {
    val greetStrings: Array[String] = new Array[String](3)
    val greetStrings2: Array[String] = new Array[String](3)

    greetStrings(0) = "Hello"
    greetStrings2.update(0, "Hello")

    greetStrings(1) = ","
    greetStrings2.update(1, ",")

    greetStrings(2) = "world!\n"
    greetStrings2.update(2, "world!\n")

    for(i <- 0 to 2)
      print(greetStrings(i))

    for(i <- 0.to(2))
      print(greetStrings2.apply(i))
  }



}
