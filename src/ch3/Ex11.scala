package ch3

import scala.math.Numeric

object Ex11 extends App {
  def sum[@specialized T] (l: List[T]) (implicit num: Numeric[T]): T =
    Ex10.foldLeft (l) (num.zero) (num.plus)

  def product[@specialized T] (l: List[T]) (implicit num: Numeric[T]): T =
    Ex10.foldLeft (l) (num.one) (num.times)

  def len (l: List[_]): Int =
    Ex10.foldLeft (l) (1) ((_, acc) => acc + 1)

  val l = List.range(1, 5)
  println(sum(l))
  println(product(l))
  println(len(l))
}
