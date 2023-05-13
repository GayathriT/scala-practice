package Search


// Linear Search - Basic Search that traverses all of the element one by one until it reaches the key element
object _1LinearSearch extends App {  
  
  val inputArr = Array.range(1,10)
  inputArr.foreach(println)
  val elem = 5
  val res = LinearSearch(inputArr,elem)
  if (!res) println("Element is not available in the Array")
  //println(res)
  
  def LinearSearch(inArr:Array[Int],data:Int)={
    var flag = false
    for(i <- 0 until inArr.length){
      if(inArr(i) == data) {
        println(s"${data} is found at Index ${i}")
        flag = true }
    } 
    flag    
  }
  
}
// Time Complexity O(N) & Space Complexity is O(1) 
