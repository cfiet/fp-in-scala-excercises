package ch4

object Ex3 {
  def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] =
    a.flatMap(v0 =>
      b.map(v1 =>
        f(v0, v1)
      )
    )
}
