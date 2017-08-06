package com.orienit.spark.training.sparkexamplenew

trait Messaging {
  def sendMessage(): String;
}

class email extends Messaging {
  def sendMessage(): String = {
    "send email"
  }
}

class sms extends Messaging {
  def sendMessage(): String = {
    "send sms"
  }
}