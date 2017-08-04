package org.com.immutable

object MapCall {
  def main(args: Array[String]): Unit = {
    val obj = new MapUseCase[Int, String]()
    var map = Map[Int, String]()
    map = obj.addElem(map, 1, "a")
    map = obj.addElem(map, 2, "b")
    print(map)
    map = obj.delElem(map, 2)
    print(map)
    val value:Option[String] = map.get(2)
    print(value)
  }
}
