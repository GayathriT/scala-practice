package Arrays

object _1RearrangeMaxMinOrder {
  def main(args: Array[String]) {
        val input=Array(1,3,4,5,2,9,7,8)
        println("Method 1")
        val res = rearrangeMaxMin(input.sorted)
       res.map(e=> print(s"${e} || "))
    }
  def rearrangeMaxMin(inputArr: Array[Int]): Array[Int] = {
    
    val len = inputArr.length
    var i=0    
    if( len > 0  )
    {
      Array(inputArr(len-1), inputArr(0)) ++ rearrangeMaxMin(inputArr.slice(i+1,len-1-i))      
    }
    else {
      
      inputArr
    }
  } 
  
  

}
