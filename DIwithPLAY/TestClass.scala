package com.orienit.spark.training.sparkexamplenew

import com.google.inject.Guice
import org.junit.Test
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matcher._

class TestClass {
  @Test
  def testInjection() {
    val injector = Guice.createInjector(new DependencyConfig)
    val instance = injector.getInstance(classOf[Messaging])
    val container = new Container(instance)
    assertThat("Failed to inject dependencies", container.sendMessage() == "send email")
    println("Succesfully sent email")
  }
}