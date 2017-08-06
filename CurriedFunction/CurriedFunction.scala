package org.com.curried

class CurriedFunction {
  val curriedFun = (x: Int) => (y: Int) => (z: Int) => x + y + z
  val function = (x: Int, y: Int, z: Int) => {
    x + y + z
  }
}

object CurriedFunction {
  def getAddThree() = {
    val ob = new CurriedFunction
    val addThree = ob.curriedFun(3)
    addThree
  }

  def getAddTwo() = {
    val ob = new CurriedFunction
    val partial = ob.function(_: Int, 2, _: Int)
    partial
  }
}
