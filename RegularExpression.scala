package org.com.RegularExp

import scala.util.matching.Regex

object RegularExpression {
  def main(args: Array[String]): Unit = {
    val regex = """(\d)+.*\s(.*)""".r
    val str = "ab1c de"
    val matchIterator = regex.findAllIn(str)
    while (matchIterator.hasNext) {
      print(matchIterator.group(1))
      print(matchIterator.group(2))
      matchIterator.next()
    }
  }
}