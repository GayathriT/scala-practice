package Arrays

object _2ReverseArray {
    val input=Array(1,3,4,5,2,9,7,8)
     def main(args: Array[String]) {

       val res2 = reversArr_1(input)
      println("Method 2")
      res2.map(e => print(s"${e} || "))
      println


    }
    
    def reversArr_1(inputArr: Array[Int]) = {
      inputArr.zipWithIndex.sortWith(_._2 > _._2)
    }
    
    
}
