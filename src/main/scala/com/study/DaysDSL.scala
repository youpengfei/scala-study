package com.study

import com.study.DateHelper._

/**
  * Created by youpengfei on 2016/10/18.
  * TODO
  */
object DaysDSL {


  def main(args: Array[String]): Unit = {

    val ago = "ago"
    val fromNow = "from_now"

    val past = 2 days ago

    val appointment = 5 days fromNow

    println(past)
    println(appointment)


  }
}
