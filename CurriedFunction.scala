package org.com.curried

class CurriedFunction {
  val curriedFun = (x: Int) => (y: Int) => (z: Int) => x + y + z
  val function = (x:Int,y:Int,z:Int)=>{
    x+y+z
  }
}

object CurriedFunction {
  def main(args: Array[String]): Unit = {
    val ob = new CurriedFunction
    val addThree = ob.curriedFun(3)
    println(addThree(2)(5))
    
    val curriedFunction = ob.function.curried
    println(curriedFunction(2)(3)(5))
    
    val partial = ob.function(2,_:Int,_:Int)
    println(partial(3,5))
  }
}

