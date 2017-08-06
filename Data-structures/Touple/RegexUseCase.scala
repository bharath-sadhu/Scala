package org.com.regex

class RegexUseCase {

  def regexCheck() = {
    val regex = """(\d)+.*\s(.*)""".r
    val str = "ab1c de"
    val matchIterator = regex.findAllIn(str)
    var matchTouple: (String, String) = ("", "")
    while (matchIterator.hasNext) {
      matchTouple = (matchIterator.group(1), matchIterator.group(2))
      matchIterator.next()
    }
    matchTouple
  }
}
