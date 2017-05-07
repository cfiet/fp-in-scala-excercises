object Ex13 extends App {
  def foldLeft2[A, B] (l: List[A]) (acc: B) (f: (A, B) => B): B =
    Ch3Utils.foldRight (l) ((b: B) => b) ((i, fnc) =>
      (b2) => fnc(f(i, b2))
    )(acc)

  def foldRight2[A, B] (l: List[A]) (acc: B) (f: (A, B) => B): B =
    Ex10.foldLeft (l) ((b: B) => b) ((i, fnc) =>
      (b2) => fnc(f(i, b2))
    )(acc)

  println(foldLeft2 (List.range(1, 5)) (List[Int]()) ((i, acc) => {
    println(acc)
    acc :+ i
  }))

  println(foldRight2 (List.range(1, 5)) (List[Int]()) ((i, acc) => {
    println(acc)
    acc :+ i
  }))
}
