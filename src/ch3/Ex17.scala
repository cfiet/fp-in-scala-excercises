object Ex17 extends App {
  def d2s (l: List[Double]): List[String] =
    Ex10.foldLeft (l) (identity[List[String]](_)) ((i: Double, cont:List[String] => List[String]) =>
      (s) => cont(i.toString() :: s)
    )(List[String]())

  println("Hello" :: d2s(List(1.0, 1.1, 1.12312, 1.99, 0.1 + 0.3)))
}
