package ch3

object Ex12 extends App {
  def reverseL[T] (l: List[T]): List[T] =
    Ex10.foldLeft (l) (List[T]()) ((i: T, acc: List[T]) => i :: acc)

  def reverseR[T] (l: List[T]): List[T] =
    Ch3Utils.foldRight (l) (List[T]()) ((i: T, acc: List[T]) => acc :+ i)

  println(reverseL(List.range(0, 10)))
  println(reverseR(List.range(0, 10)))
}
