package com.study

/**
  * Created by youpengfei on 2016/10/18.
  * TODO
  */
trait CriminalCheck extends Check {
  override def check(): String = "Checked Criminal..." + super.check()
}
