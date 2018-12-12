package models

class StringIterator(s: String) extends GenIterator {

  type T = Char
  private var i = 0

  def hasNext = i < s.length

  def next() = {
    val ch = s charAt i
    i += 1
    ch
  }
}
