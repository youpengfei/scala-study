package com.study

/**
  * Created by youpengfei on 2016/10/18.
  * TODO
  */
trait CreditCheck extends Check {
  override def check(): String = "Checked Credit..." + super.check()
}
