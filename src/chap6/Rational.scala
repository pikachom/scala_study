package chap6

class Rational (n: Int, d: Int){
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val number = n / g
  val denom = d / g
  def this(n: Int) = this(n,1)
  def + (that: Rational): Rational =
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )
  def + (i: Int): Rational =
    new Rational(
      number + i * denom,
      denom
    )
  def * (that: Rational): Rational =
    new Rational(number * that.number, denom * that.denom)
  def * (i: Int): Rational =
    new Rational(number * i, denom)
  def - (that: Rational): Rational =
    new Rational(
      number * that.denom - that.number * denom,
      denom * that.denom
    )
  def - (i: Int): Rational =
    new Rational(number - i * denom, denom)
  def / (that: Rational): Rational =
    new Rational(
      number * that.denom,
      denom * that.number
    )
  def / (i: Int): Rational =
    new Rational(number, denom * i)
  override def toString: String = number+ "/"+ denom
  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b , a % b)
}


object Rational{
  def main(args: Array[String]): Unit = {
    val x = 1
    val y = new Rational(1,3)
    implicit def intToRational(x: Int) = new Rational(x) // 암시적 변환 선언
    val z = x + y
    println(z)
  }
}