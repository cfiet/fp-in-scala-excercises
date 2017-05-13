package ch3

object Ex24 extends App {
  def hasSubsequence[A] (sup: List[A]) (sub: List[A]): Boolean =
    if (sub.isEmpty)
      true
    else if (sup.length < sub.length)
      false
    else if (sup.take(sub.length) == sub)
      true
    else
      hasSubsequence (sup.tail) (sub)


  println(hasSubsequence (List(1,2,3,4,5)) (List(1,2,3)))
  println(hasSubsequence (List(1,2,4,5)) (List(1,2,3)))

  println(hasSubsequence (List(1,1,1,1,1,2,3)) (List(1,2,3)))
  println(hasSubsequence (List(1,1,1,1,1,2)) (List(1,2,3)))
}
