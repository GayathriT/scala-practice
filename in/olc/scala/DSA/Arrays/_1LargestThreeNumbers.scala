package Arrays

object _1LargestThreeNumbers {
 // def add(x:Int, y:Int) = x + y;

    def main(args: Array[String]) {
        // print("sum of x + y = " + add(25,10));
        val input = Array(0,3,1,5,2,8,10,4)
        println("Method 1 ")
        highest3(input)
        
    }
    

   
      def highest3_1(inputArr:Array[Int]) {
        
        val len = inputArr.length
        println("length: " +  len )
        if ( len < 3 ) { println( " Invalid Array " ) }
        else
        {
            var first =0
            var sec = 0
            var third = 0
            
            for (i <- 0 until len) {
            if(inputArr(i) > first)
            {
                third = sec
                sec = first
                first = inputArr(i)
            }
            else if (inputArr(i) > sec) {
                third = sec
                sec = inputArr(i)
            }
            else if (inputArr(i) > third) {
                third = inputArr(i)
            }
            }
            println(s"first: ${first} | second: ${sec} | third: ${third}")
        }
        
    }
      


}
