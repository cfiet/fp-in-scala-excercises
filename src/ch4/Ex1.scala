package ch4

object Ex1 extends App{
  println(Some(10) map (_.toString() + " wooooah"))
  println(None map (_.toString() + " wooooah"))

  println(Some(10) getOrElse(0))
  println(None getOrElse(0))


  val elseVal = () => {
    println("Running Else")
    None
  }
  println(Some(10) orElse(elseVal()))
  println(None orElse(elseVal()))

  val fmProc = (i: Int) => {
    println("Running flatMap")
    Some(i)
  }
  println(Some(10) flatMap fmProc)
  println(None flatMap fmProc)

  val isOdd = (i: Int) => i % 2 == 0
  println(Some(0) filter isOdd)
  println(Some(1) filter isOdd)
  println(None filter isOdd)
}
