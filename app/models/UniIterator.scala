package models

trait UniIterator extends GenIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}
