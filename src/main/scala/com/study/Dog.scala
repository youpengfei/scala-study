package com.study

/**
  * Created by youpengfei on 2016/10/18.
  * TODO
  */
class Dog(override val name: String) extends Animal with Friend {
  override def listen(): Unit = println(name + "'s listening quietly")
}
