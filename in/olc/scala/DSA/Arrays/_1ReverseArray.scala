package Arrays

object _1ReverseArray {
    val input=Array(1,3,4,5,2,9,7,8)
     def main(args: Array[String]) {

      val res3 = reversArr_3(input)
      println("Method 1")
      res3.map(e => print(s"${e} || "))
      println
    }
    
  
    def reversArr_3(inputArr: Array[Int]) = {
      val len = inputArr.length
      var j = len-1
      for (i <- 0 until len) {
        if (j > i) {
            var temp = inputArr(i)
            inputArr(i)=inputArr(j)
            inputArr(j)=temp
            j = j-1
        }
      }
      inputArr
    }
    
}
