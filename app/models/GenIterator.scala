package models

abstract class GenIterator {
  type T

  def hasNext: Boolean

  def next(): T
}
