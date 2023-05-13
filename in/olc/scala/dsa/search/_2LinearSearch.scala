package Search


// Linear Search - Basic Search that traverses all of the element one by one until it reaches the key element
object _2LinearSearch extends App {  
  
  val inputArr = Array.range(1,10)
  inputArr.foreach(println)
  var flag = false
  val elem = 15
  val res = LinearSearchRecursive(inputArr,elem)
  
  if (!res) println("Element is not available in the Array")
  else println("Element is available in the Array")
  //println(res)
  
  def LinearSearchRecursive(inArr:Array[Int],data:Int):Boolean ={
    if (inArr.length > 0) {
    if(inArr(0) == data) flag=true
    else LinearSearchRecursive(inArr.slice(1, inArr.length),data)    
    }
    flag
  }
  
}
// Time Complexity O(N) & Space Complexity is O(N) -- because of the stack space
