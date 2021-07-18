package codes
import scala.io.StdIn._

object First {
  def main(args : Array[String])
  {
    print("Input Your Number ")
    val num=scala.io.StdIn.readInt()
    print("Have You Input A Prime Number : ")
    if(primeNo(num))
    {
      println("True")
    }
    else
    {
      println("False")
    }
  }
  def gcd(a:Int ,b:Int):Int = b match
  {
    case 0 => a
    case b if (b>a) => gcd(b,a)
    case _ => gcd(b,a%b)
  }
  def primeNo(x:Int,y:Int=2) : Boolean=y match
  {
    case a if(x==a) => true
    case a if(gcd(x,a)>1) => false
    case a => primeNo(x,a+1)
  }
}