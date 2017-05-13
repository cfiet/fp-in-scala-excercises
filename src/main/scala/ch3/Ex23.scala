package ch3

object Ex23 extends App {
  def zipWith[A, B, C] (a: List[A]) (b: List[B]) (f: (A, B) => C): List[C] = {
    if (a.isEmpty || b.isEmpty)
      List[C]()
    else
      f(a.head, b.head) :: (zipWith (a.tail) (b.tail) (f))
  }

  println(zipWith (List(0, 1, 2)) (List(3, 4, 5)) (_ + _))
}
