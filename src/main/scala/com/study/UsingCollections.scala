package com.study

/**
  * Created by youpengfei on 2016/10/19.
  * TODO 
  */
object UsingCollections {
  def main(args: Array[String]): Unit = {
    val colors1 = Set("Blue", "Green", "Red")
    var colors = colors1

    println("color1 (color) :" + colors)

    colors += "Black"

    println("colors: " + colors)
    println("colors1: " + colors1)

  }

}
