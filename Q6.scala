package codes
import java.util.Scanner
import scala.io.StdIn._

object Sixth 
{
  def fib(x:Int):Int=x match
  {
    case 0 => 0
    case y if y==1 =>1
    case _ => fib(x-1)+fib(x-2)
  }
 def fsq(x:Int):Unit={
   if(x>0)
   {
     fsq(x-1)
   }
   println(fib(x))
 }
 
  
  def main(args : Array[String])
  {
    var input = new Scanner (System.in)
    print("Input Your Number ")
    val num=input.nextInt()
    println("The Fibonacci Sequence ")
    fsq(num)
  }  
}