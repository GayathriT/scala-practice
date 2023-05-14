package Search

// Binary Search - can be applied only on the Sorted Array

object _1BinarySearch extends App {

  val inputArr = Array.range(1, 10)
  inputArr.map(e => print(s"$e | "))
  println()
  val elem = 3
  val res = BinarySearch(inputArr, elem)
  //if(!res) println("The Element is not in the List")

  def BinarySearch(inArr: Array[Int], data: Int): Boolean = {
    val len = inArr.length
    //    val mid = len/2

    if (len == 1 && data != inArr(len / 2)) {
      println(s"$data is not present in the input Array")
      false
    } else {

      if (data == inArr(len / 2)) {
        println(s"$data is present in the input Array")
        true
      } else if (data < inArr(len / 2)) {
        // println(inArr(len / 2))
        // println ("I am in else if")
        BinarySearch(inArr.slice(0, len / 2), data)
      } else {
        //  println ("I am @ else ")
        BinarySearch(inArr.slice((len / 2) + 1, len), data)
      }
    }

  }

}

// Time Complexity: O(log N) & Space Complexity: O(1) --> Auxiliary Space will be O(N) if the stack is to be considered on recursion  
