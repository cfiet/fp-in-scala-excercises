package ch5

object StreamMain extends App {
  def ex5_1 = {
    val stream = cons({
      println("Evaluating")
      1
    }) (empty)

    println("Unevaluated?")
    println(stream.toList)
  }
  //ex5_1

  def ex5_2 = {
    var x = 0
    def inc: Int = {
      val r = x
      print("Ev ", x)
      x += 1
      r
    }

    val mkStream = () =>
      cons (inc) (
        cons (inc) (
          cons (inc) (
            cons (inc) (
              cons (inc) (empty)))))

    println(mkStream().take(2).toList, x)

    x = 0
    println(mkStream().drop(2).toList, x)

    x = 0
    println(mkStream().toList, x)
  }
  //ex5_2

  def ex5_3 = {
    var x = 0
    def inc: Int = {
      val r = x
      print("Ev ", x)
      x += 1
      r
    }

    val mkStream = () =>
      cons (inc) (
        cons (inc) (
          cons (inc) (
            cons (inc) (
              cons (inc) (empty)))))

    println(mkStream().takeWhile(_ < 2).toList)
  }
  //ex5_3

  def ex5_4 = {
    var x = 0
    def inc: Int = {
      val r = x
      println("Ev ", x)
      x += 1
      r
    }

    val mkStream = () =>
      cons (inc) (
        cons (inc) (
          cons (inc) (
            cons (inc) (
              cons (inc) (empty)))))

    println(mkStream().foldRight (0) (_ + _))
  }
  //  ex5_4

  def ex5_5 = {
    var x = 0
    def inc: Int = {
      val r = x
      println("Ev ", x)
      x += 1
      r
    }

    val mkStream = () =>
      cons (inc) (
        cons (inc) (
          cons (inc) (
            cons (inc) (
              cons (inc) (empty)))))

    println(mkStream().forAll(_ < 2))
  }
  ex5_5
}
