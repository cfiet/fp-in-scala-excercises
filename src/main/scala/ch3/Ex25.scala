package ch3

object Ex25 extends App {
  def treeSize[_] (t: Tree[_]): Int =
    t match {
      case Leaf(_) => 1
      case Branch(a, b) => 1 + treeSize(a) + treeSize(b)
    }

  val t5 = Branch(
    Branch(
      Leaf(0),
      Leaf(0)
    ),
    Leaf(1)
  )
  println(treeSize(t5))

  val t7 = Branch(
    Branch(
      Leaf(0),
      Leaf(0)
    ),
    Branch(
      Leaf(0),
      Leaf(0)
    )
  )
  println(treeSize(t7))
}
