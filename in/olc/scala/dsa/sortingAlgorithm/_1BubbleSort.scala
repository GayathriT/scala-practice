package sortingAlgo

object _1BubbleSort extends App {
  
  val inputArr1 = Array(3,2,5,1,8,4)
  inputArr1.map(e => print(s"$e | "))
  println()
  
  BubbleSort(inputArr1)
  inputArr1.map(e => print(s"$e | "))
  
  def BubbleSort(inArr: Array[Int]) = {
    
    for(i <- 0 until inArr.length){
      for(j<- 0 until inArr.length-i if j+1 < inArr.length ) {
      if( inArr(j) > inArr(j+1) ) {
        val temp = inArr(j)
        inArr(j) = inArr(j+1)
        inArr(j+1)= temp
        }
      }
    }
  }
  
}

// Time Complexity: O(N*N) or O(N*M) || Space Complexity: O(1)
