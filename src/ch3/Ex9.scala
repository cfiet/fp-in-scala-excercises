import scala.collection.AbstractSeq

object Ex9 extends App {
  def foldLen(l: AbstractSeq[_]): Int =
    l.foldRight (0) ((_, acc:Int) => acc + 1)

  println(foldLen (List.range(0, 100)))
}
