package LinkedList

class Node3 {      
      var Node3Data:Int = 0
      var next:Node3= null
      }


class LinkedList1 {
      var head:Node3 = null
      
      def pushAtFront(i:Int) = {
        var newNode = new Node3()
        newNode.Node3Data = i
        newNode.next = head        
        head = newNode
      }
      
      def pushAtEnd(i:Int) = {
        var newNode = new Node3()
        newNode.Node3Data = i
        newNode.next = null
        
        if(head == null) {          
          head =  newNode          
        }
        else {
        var last_node = head
        while (last_node.next != null) {          
          last_node=last_node.next
        }
        last_node.next = newNode       
        }
         
      }
      def pushAtMiddle(prev_node:Node3,i:Int) = {
        
        
        if(prev_node == null) {          
          println("Prev Node Cannot be Empty")        
        }        
        else {
        var newNode = new Node3()
        newNode.Node3Data = i        
        newNode.next = prev_node.next
        prev_node.next = newNode
        
        }
            
      }
      def reverseTheList() = {
        var current_node= head
        var prevNode:Node3=null
        var nextNode:Node3=null
        //var i=1
        while (current_node != null) {
          //println(s"inside loop $i")
          nextNode = current_node.next
          current_node.next=prevNode
          prevNode= current_node  
          current_node= nextNode          
        }
        head =  prevNode
      }
      
      def printList()={
        var parseNode3 = head
        while (parseNode3 != null) {
          println(parseNode3.Node3Data)
          parseNode3=parseNode3.next
        }
      }
      def findLenOfList() = {
    var presentData = head
    var count = 0
    while (presentData != null) {
      count = count + 1
      presentData = presentData.next
    }
    //count
    println(s"The count of the Lunked List is $count")
    }
        def findData (i:Int) = {    
    var presentData = head
    var temp = false
    while ( presentData != null ) {
      if(presentData.Node3Data == i) {
        temp = true      
        
      } 
      presentData = presentData.next      
    }    
    if(!temp) (println(s"$i is not present in the Linked List") )
    else ( println(s"$i is present in the Linked List") )
  }
        def deleteFromFront()={
          head = head.next          
        }
        
        def deleteFromEnd()={
          var current_node=head
          var prev_node:Node3=null
          while(current_node.next != null) {
            prev_node=current_node
            current_node=current_node.next
          }
          prev_node.next = null
          
        }
        
}

object _SinglyLinkedList {
  
   def main(args: Array[String]) { 
     println("Single Linked List")
     val lklst = new LinkedList1
     println("Inserted at the Front")
     lklst.pushAtFront(10)
     lklst.pushAtFront(20)
     lklst.pushAtFront(30)
     println("Inserted at the End")
     lklst.pushAtEnd(40)
     println("Inserted in the Middle")
     lklst.pushAtMiddle(lklst.head.next,500)
     println("Print the List")
     lklst.printList()
     println("Print the reversed Linked List")
     lklst.reverseTheList
     lklst.printList()
     println("Find a data from the Linked List")
     lklst.findData(50)
     println("Length of the Linked List")
     lklst.findLenOfList()
     println("Delete From Front of the Linked List")
     lklst.deleteFromFront()
     lklst.printList()
     println("Delete at the End of the Linked List")
     lklst.deleteFromEnd()
     lklst.printList()
     
   }   
  
}
