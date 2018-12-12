object simple {
  def square(x: Double) = {
    x*x
  }
  def sqrt_root(x: Int) = {
    var result = 0
    for (i <- 0 to x){
      if (i*i == x) { 
        result = i
      }
    }
    result 
  }

  def fib(n: Int): Int = {
    if (n == 0) {
      n
    }
    else if (n == 1) {
      n
    }
    else {
      fib(n - 1) + fib(n - 2)
    }
  }

  def f(a: Int)(b: Int): Int = {
    a + b
  }


  def main(args: Array[String]): Unit = {
    println(f(5)(7))
  }
}
