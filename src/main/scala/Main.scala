package ru.example
import scala.collection.mutable
import scala.io.StdIn.readLine

object Main extends App {
//  println("Please enter count of elements:")
  val count = readLine().toInt

//  println("Please enter elements of collection:")
  val strElem = readLine()

// Easy )
//  val arr = strElem.split(",")
//  val realCount = arr.length
//  val uniqCount = arr.toSet.size
//
//  println(realCount - uniqCount)

// Imperative way
  var i:Int = 0
  val dict = mutable.Map[String, Int]()
  strElem.split(",").foreach{x =>
    if (dict.contains(x)) i = i + 1
    else dict.put(x, 0)
  }
  println(i)
}
