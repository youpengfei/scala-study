package com.study

/**
  * Created by youpengfei on 2016/10/18.
  * TODO
  */
trait EmploymentCheck extends Check {
  override def check(): String = "Checked Employment..." + super.check()
}
