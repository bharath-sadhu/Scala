package org.com.Set

class SetUseCase[T] {
  def addElem(set: Set[T], a: T) = {
    set.+(a)
  }

  def removeElem(set: Set[T], a: T) = {
    set.-(a)
  }
}
