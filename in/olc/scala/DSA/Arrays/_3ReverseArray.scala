package Arrays

object _3ReverseArray {
    val input=Array(1,3,4,5,2,9,7,8)
     def main(args: Array[String]) {

       val res3 = reversArr_2(input)
      println("Method 3")
      res2.map(e => print(s"${e} || "))
      println


    }
    def reversArr_2(inputArr: Array[Int]) = {
      inputArr.reverse
    }
    
}
