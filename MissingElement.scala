class MissingElement(){
  def calculate(elements:Array[Int]): Int = {
    val expectedSum = sum(elements.length + 1)

    val actualSum = elements.foldLeft(0)(_+_)

    val missingElement = expectedSum - actualSum
    missingElement
  }

  def sum(n: Int) : Int = {
    (n * (n+1)) / 2
  }
}
