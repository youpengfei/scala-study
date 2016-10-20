package com.study

/**
  * Created by youpengfei on 2016/10/18.
  * TODO
  */
object Decorator {
  def main(args: Array[String]): Unit = {
    val apartmentApplication = new Check with CreditCheck with CriminalCheck
    println(apartmentApplication check)
  }
}
