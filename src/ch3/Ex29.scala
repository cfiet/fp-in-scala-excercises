object Ex29 extends App {
  def treeFold[A, B] (t: Tree[A]) (lf: A => B) (mf: (B, B) => B): B =
    t match {
      case Leaf(v) => lf(v)
      case Branch(l, r) => {
        mf(
          treeFold (l) (lf) (mf),
          treeFold (r) (lf) (mf)
        )
      }
    }

  def treeSize (t: Tree[_]): Int =
    treeFold (t) (_ => 1) ((ls, rs) => 1 + ls + rs)

  def treeDepth (t: Tree[_]): Int =
    treeFold (t) (_ => 1) ((ls, rs) => 1 + ls.max(rs))

  def treeMax (t: Tree[Int]): Int =
    treeFold (t) (identity[Int](_)) ((ls, rs) => ls.max(rs))

  def treeMap[A, B] (t: Tree[A]) (f: A => B): Tree[B] =
    treeFold[A, Tree[B]] (t) (i => Leaf(f(i))) ((lt: Tree[B], rt: Tree[B]) => Branch[B](lt, rt))

  val t = Branch(Branch(Leaf(0), Leaf(1)), Branch(Leaf(2), Leaf(99)))

  println(treeSize(t))
  println(treeDepth(t))
  println(treeMax(t))
  println(treeMap (t) (2 *))
}
