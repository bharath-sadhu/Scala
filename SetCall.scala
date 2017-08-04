package org.com.immutable

import scala.collection.immutable
object SetCall {
  def main(args: Array[String]): Unit = {
    val obj = new SetUseCase[Int]
    var set = Set[Int]()
    set = obj.addElem(set, 1)
    set = obj.addElem(set, 2)
    set = obj.addElem(set, 3)
    set = obj.addElem(set, 2)
    print(set)
    set = obj.removeElem(set, 2)
    print(set)
  }
}