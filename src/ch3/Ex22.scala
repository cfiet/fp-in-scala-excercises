object Ex22 extends App {
  def zipInt (a: List[Int]) (b: List[Int]): List[Int] =
    if (a.isEmpty || b.isEmpty)
      List[Int]()
    else
      (a.head + b.head) :: (zipInt (a.tail) (b.tail))


  def zip[A, B, C] (a: List[A]) (b: List[B]) (f: (A, B) => C): List[C] = {
    if (a.isEmpty || b.isEmpty)
      List[C]()
    else
      f(a.head, b.head) :: (zip (a.tail) (b.tail) (f))
  }

  println(zipInt (List(0, 1, 2)) (List(3, 4, 5)))
}
