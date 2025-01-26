```scala
class MyClass(var x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
  def modifyX(newValue:Int): Unit = {
    x = newValue
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(5)
    println(obj.myMethod(10)) // Prints 15
    obj.modifyX(10)
    println(obj.x) // Prints 10
    // Alternatively, to avoid mutation: create a new instance
    val obj2 = new MyClass(obj.x + 5)  //Creates a new instance with x = 15
  }
}
```