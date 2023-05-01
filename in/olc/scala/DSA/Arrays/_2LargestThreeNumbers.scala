package Arrays

object _2LargestThreeNumbers {
  def add(x:Int, y:Int) = x + y;

    def main(args: Array[String]) {
        // print("sum of x + y = " + add(25,10));
        val input = Array(0,3,1,5,2,8,10,4)
        println("Method  ")
        highest3_2(input)
    }
     
      
      def highest3_2(inputArr:Array[Int]) {
        
            // val i: Array[Int] = Array(1, 4, 6, 2, 7, 8, 0)
          inputArr.sortWith(_ > _).slice(0, 3).map(e => print(s"${e} || ")) //.foreach(println)
        }

}
