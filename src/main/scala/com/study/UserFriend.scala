package com.study



object Hi {
  def useFriend(friend:Friend)=friend listen

  def main(args: Array[String]) = {
    val john = new Man("john")
    val sara = new WoMan("Sara")
    val comet = new Dog("comet")
    val snowy = new Cat("snowy") with Friend

    useFriend(snowy)

    john.listen
    sara.listen
    comet.listen
  }


}
