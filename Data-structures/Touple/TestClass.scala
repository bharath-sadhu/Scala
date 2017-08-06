package org.com.regex

import org.junit.Test
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matcher._

class TestClass {
  @Test
  def testAppendToSet() {
    var ob = new RegexUseCase
    var regex = ob.regexCheck()
    assertThat("Failed to split string using regex", regex._1 == "1" && regex._2 == "de")
    println("Succesfully verified regex")
  }
}