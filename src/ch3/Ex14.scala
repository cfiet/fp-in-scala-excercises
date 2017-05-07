object Ex14 extends App {
  def appendR[A] (l: List[A]) (a: A): List[A] =
    Ch3Utils.foldRight (l) (List(a)) ((i, acc) => i :: acc)

  def appendL[A] (l: List[A]) (a: A): List[A] =
    Ex10.foldLeft (l) ((i: List[A]) => i) ((i, fun) =>
      (a2) => fun(i :: a2)
    )(List(a))

  println(appendR (List(0, 1, 2, 3)) (4))
  println(appendL (List(0, 1, 2, 3)) (4))
}
