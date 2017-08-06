package org.com.curried

import org.junit.Test
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matcher._

class TestClass {
  @Test
  def testAddThree() {
    val addThree = CurriedFunction.getAddThree();
    assertThat("Failed", addThree(2)(5) == 10)
    println("Verified add three function")
  }

  @Test
  def testAddTwo() {
    val addTwo = CurriedFunction.getAddTwo();
    assertThat("Failed", addTwo(2, 5) == 9)
    println("Verified add two function")
  }
}