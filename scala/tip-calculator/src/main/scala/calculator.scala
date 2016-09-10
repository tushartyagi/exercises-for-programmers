import scala.io.StdIn.readLine


object Hi {
  def calculateTip(billAmount: Int, tipRate: Int): Double = {
    val tip = billAmount * (tipRate / 100)
    BigDecimal(tip).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }


  def main(args: Array[String]) = {
    println("What is the bill amount")
    val billAmount = readInt
    println("What is the tip amount")
    val tipRate = readInt
    val tip = calculateTip(billAmount, tipRate)
    tip
  }
}
