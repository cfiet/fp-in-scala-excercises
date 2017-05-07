object Ch3Utils {
  def foldRight[A, B](l: List[A])(acc: B)(f: (A, B) => B): B =
    l match {
      case Nil => acc
      case h :: t => f(h, foldRight (t) (acc) (f))
    }
}
