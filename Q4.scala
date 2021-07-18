package codes
import java.util.Scanner
import scala.io.StdIn._

object Fourth 
{
  def isEven(x:Int): Boolean=x match
  {
    case 0 => true
		case _ => isOdd(x-1)
  }
	
	def isOdd(x:Int): Boolean=
	{
     		!(isEven(x)) 
  }

	def main(args:Array[String])
	{
    var input = new Scanner (System.in)
    print("Input Your Number ")
    val num=input.nextInt()
    print("The Number You Have Input is an ")
    if(isOdd(num))
    {
      print("Odd Number")
    }
    else
    {
      print("Even Number")
    }
	}  
}