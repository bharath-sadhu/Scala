package org.com.Map

class MapUseCase[K, V] {
  def addElem(map: Map[K, V], key: K, value: V) = {
    val newmap = map + (key -> value)
    newmap
  }

  def delElem(map: Map[K, V], key: K) = {
    val newmap = map - (key)
    newmap
  }
}
