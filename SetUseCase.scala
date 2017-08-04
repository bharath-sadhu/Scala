package org.com.immutable

class SetUseCase[T] {
  def addElem(set: Set[T], a: T) = {
    set.+(a)
  }

  def removeElem(set: Set[T], a: T) = {
    set.-(a)
  }
}