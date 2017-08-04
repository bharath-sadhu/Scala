package org.com.immutable

object ListExample {
  def main(args: Array[String]): Unit = {
    var list = List[Int]()
    list = ListExample.add(list, 1)
    list = ListExample.add(list, 2)
    list = ListExample.add(list, 3)
    list = ListExample.add(list, 4)
    print(list)
    list = ListExample.remove(list, 2)
    print(list)
    list = ListExample.removeAt(list, 2)
    print(list)
    list = ListExample.insertAt(list, 2, 5)
    print(list)
  }

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