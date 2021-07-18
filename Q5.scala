package codes
import java.util.Scanner
import scala.io.StdIn._

object Fifth 
{
  def sumOfEven(x:Int,y:Int=2,z:Int=0): Any=
  {
    if(x<1)
    {
      println("You Have Input A Negative Number Please Input A Positive Number ")
    }
    else if(y<x)
    {
      if(isEven(y))
      {
        return sumOfEven(x,y+1,z+y)
      }
      else
      {
        return sumOfEven(x,y+1,z)
      }
    }
    else
    {
      print(z)
    }
  }
  def isEven(x:Int): Boolean=x match
  {
    case 0 => true
		case _ => isOdd(x-1)
  }
	
	def isOdd(x:Int): Boolean=
	{
     		!(isEven(x)) 
  }
  
  def main(args : Array[String])
  {
    var input = new Scanner (System.in)
    print("Input Your Number ")
    val num=input.nextInt()
    print("Sum Of All The Even Numbers Below The Number You Have Input : ")
    sumOfEven(num)
  }  
}