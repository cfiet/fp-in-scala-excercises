package ch4

object Ex2 {
  def avg(xs: Seq[Double]): Option[Double] =
    Some(xs) filter (_ isEmpty) map (l => l.sum / l.length)

  def variance(xs: Seq[Double]): Option[Double] = {
    avg (xs) flatMap (m =>
      avg (xs map (v => Math.pow(v - m, 2)))
    )
  }
}
