package com.study

import java.util.{Calendar, Date}

/**
  * Created by youpengfei on 2016/10/18.
  * TODO
  */
class DateHelper(number: Int) {
  def days(when: String): Date = {
    val date = Calendar.getInstance()
    when match {
      case DateHelper.ago => date.add(Calendar.DAY_OF_MONTH, -number)
      case DateHelper.fromNow => date.add(Calendar.DAY_OF_MONTH, number)
      case _ => date
    }
    date.getTime
  }
}

object DateHelper {

  val ago = "ago"
  val fromNow = "from_now"

  implicit def convertInt2DateHelper(number: Int) = new DateHelper(number)
}
