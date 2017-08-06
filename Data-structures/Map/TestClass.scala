package org.com.Map

import org.junit.Test
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matcher._

class TestClass {
  @Test
  def testAppendToMap() {
    var ob = new MapUseCase[Int, String]
    var map = ob.addElem(Map[Int, String](), 12, "Bharath")
    map = ob.addElem(map, 13, "sadhu")
    assertThat("Failed to add elements to map", map == Map(12 -> "Bharath", 13 -> "sadhu"))
    println("Succesfully verified map addition")
  }

  @Test
  def testRemoveFromMap() {
    var ob = new MapUseCase[Int, String]
    var map = ob.addElem(Map[Int, String](), 12, "Bharath")
    map = ob.addElem(map, 13, "sadhu")
    assertThat("Failed to add elements to map", map == Map(12 -> "Bharath", 13 -> "sadhu"))
    println("Succesfully verified map addition")
    map = ob.delElem(map, 12)
    assertThat("Failed to delete entry from map", map == Map(13 -> "sadhu"))
    println("Succesfully verified deletion of entry from map")
  }
}