package tip.calculator

import scala.io.StdIn.readDouble

object TipCalculator {

  def readBillAmount: Double = {
    try {
      println("What is the bill amount")
      val billAmount = readDouble
      if (billAmount < 0.0) readBillAmount
      else billAmount
    }
    catch {
      case e: Exception => readBillAmount
    }
  }

  def readTipRate: Double = {
     try {
       println("What is the tip rate")
       val tipRate = readDouble
       if (tipRate < 0.0) readTipRate
       else tipRate
    }
    catch {
      case e: Exception => readTipRate
    }
  }

  def tip(billAmount: Double, tipRate: Double): Double = {
    val tip = billAmount * (tipRate / 100.0)
    BigDecimal(tip).setScale(2).toDouble
  }

  def calculate(): Unit = {
    val billAmount = readBillAmount
    val tipRate = readTipRate
    val tipAmount = tip(billAmount, tipRate)
    
    println("Tip: $" + tipAmount)
    println("Total: $" + (billAmount + tipAmount))

  }
}
