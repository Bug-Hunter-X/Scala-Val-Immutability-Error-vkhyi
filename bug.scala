```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(5)
    println(obj.myMethod(10)) // This will correctly print 15
    // Here's a common error: trying to modify a val
    // obj.x = 10 // This will cause a compilation error because x is a val
  }
}
```