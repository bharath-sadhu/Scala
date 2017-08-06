package com.orienit.spark.training.sparkexamplenew

import javax.inject.Inject
import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Module

class Container @Inject() (message: Messaging) {
  def sendMessage() = {
    message.sendMessage()
  }
}

