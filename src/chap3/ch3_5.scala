package chap3

object ch3_5 {
  //immutable set example
  def main(args: Array[String]): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    println(jetSet.mkString(","))
    jetSet += "Lear"
    println(jetSet.mkString(","))

    println("Set jetSet is " + jetSet.getClass)
    println("Thus, jetSet with 3 elems is new Set!")

    println("======================================")
    import scala.collection.mutable.Set
    val movieSet = Set("Avengers", "Spiderman") // mutable set with type inference
    movieSet += "Thor"
    println(movieSet)
    println("Set movieSet is " + movieSet.getClass)
  }


}
