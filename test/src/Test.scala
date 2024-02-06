package test

object example {
  def main(args: Array[String]): Unit = {
    println("sleep...")
    Thread.sleep(Int.MaxValue)
  }
}
