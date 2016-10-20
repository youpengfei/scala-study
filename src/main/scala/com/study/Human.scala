package com.study

/**
  * Created by youpengfei on 2016/10/18.
  * TODO
  */
class Human(val name: String) extends Friend

class Man(override val name: String) extends Human(name)

class WoMan(override val name: String) extends Human(name)
