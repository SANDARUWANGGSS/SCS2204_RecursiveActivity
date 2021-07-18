package codes
import java.util.Scanner
import scala.io.StdIn._

object Third 
{
  def recursiveSum(x:Int,y:Int=0): Int=x match
  {
		case 0 =>y
		case i if i>0 => recursiveSum((x-1),(x+y))
  }
  
  def main(args : Array[String])
  {
    var input = new Scanner (System.in)
    print("Input Your Number ")
    val num=input.nextInt()
    print("Sum Of All The Numbers Below The Number You Have Input : ")
    print(recursiveSum(num))
  }
}