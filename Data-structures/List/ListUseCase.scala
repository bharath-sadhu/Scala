package org.com.list

class ListUseCase {
  def add[T](list: List[T], a: T) = {
    list :+ (a)
  }

  def remove[T](list: List[T], a: T) = {
    list.filter(k => k != a)
  }

  def removeAt[T](list: List[T], index: Int) = {
    list.take(index).++(list.drop(index + 1))
  }

  def insertAt[T](list: List[T], index: Int, elem: T) = {
    list.take(index).:+(elem).++(list.drop(index))
  }
}
