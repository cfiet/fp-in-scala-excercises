package ch3

object Ex6 extends App {
  def init[_](l: List[_]): List[_] =
    if (l.length <= 1)
      List()
    else
      init (l.head :: init(l.tail))


    println(init(List.range(0, 10)))
}
