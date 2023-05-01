package Arrays

object _3LargestThreeNumbers {
  def add(x:Int, y:Int) = x + y;

    def main(args: Array[String]) {
        // print("sum of x + y = " + add(25,10));
        val input = Array(0,3,1,5,2,8,10,4)
        println("Method  ")
        highest3(input)
    }
     
      
          def highest3(inputArr:Array[Int]) {
        
            // val i: Array[Int] = Array(1, 4, 6, 2, 7, 8, 0)
          inputArr.sorted.slice(inputArr.length-3,inputArr.length).map(e => print(s"${e} || ")) //.foreach(println)
        }


}
