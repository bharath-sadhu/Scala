package org.com.Set

import org.junit.Test
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matcher._

class TestClass {
  @Test
  def testAppendToSet() {
    var ob = new SetUseCase[Int]
    var set = ob.addElem(Set[Int](), 12)
    set = ob.addElem(set, 13)
    set = ob.addElem(set, 12)
    assertThat("Failed to add elements to set", set == Set(12, 13))
    println("Succesfully verified set addition")
  }

  @Test
  def testDeleteFromSet() {
    var ob = new SetUseCase[Int]
    var set = ob.addElem(Set[Int](), 12)
    set = ob.addElem(set, 13)
    set = ob.addElem(set, 14)
    set = ob.removeElem(set, 14)
    assertThat("Failed to remove elements from set", set == Set(12, 13))
    println("Succesfully verified set removal")
  }
}