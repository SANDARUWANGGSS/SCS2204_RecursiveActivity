package codes
import java.util.Scanner
import scala.io.StdIn._

object Second
{
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
  def primes(z:Int): Unit={
    if(z>2)
    {
      primes(z-1)
    }
    var bool=(primeNo(z))
    if(bool)
    {
      println(z)
    }
  }
  def main(args : Array[String])
  {
    var input = new Scanner (System.in)
    print("Input Your Number ")
    val num=input.nextInt()
    println("All The Prime Numbers Below The Number You Have Input ")
    primes(num)
    
  }
}