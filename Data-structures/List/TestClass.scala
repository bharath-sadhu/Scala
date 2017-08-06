package org.com.list

import org.junit.Test
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matcher._

class TestClass {

  @Test
  def testAppendList() {
    var ob = new ListUseCase
    var list = ob.add(List[Int](), 3)
    list = ob.add(list, 4)
    assertThat("Failed", list == List(3, 4))
    println("Succesfully verified list append")
  }

  @Test
  def testRemoveEnd() {
    var ob = new ListUseCase
    var list = ob.add(List[Int](), 3)
    list = ob.add(list, 4)
    list = ob.add(list, 5)
    assertThat("Failed to append", list == List(3, 4, 5))
    assertThat("Failed to remove", ob.remove(list, 4) == List(3, 5))
    println("Succesfully removed element from list")
  }

  @Test
  def testInsertAt() {
    var ob = new ListUseCase
    var list = ob.add(List[Int](), 3)
    list = ob.add(list, 4)
    list = ob.add(list, 5)
    assertThat("Failed to append", list == List(3, 4, 5))
    assertThat("Failed to insert", ob.insertAt(list, 1, 2) == List(3, 2, 4, 5))
    println("Succesfully inserted at correct position in list")
  }
}