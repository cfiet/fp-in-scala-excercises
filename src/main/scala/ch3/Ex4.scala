package ch3

object Ex4 extends App {
  def drop(l: List[_], n: Int): List[_] =
    if (n <= 0 || l.length < n)
      l
    else {
      val _ :: t = l
      drop(t, n-1)
    }

  println(drop(List(), 10))
  println(drop(List(1, 2, 3), 2))
  println(drop(List.range(0, 99), 50))
}
