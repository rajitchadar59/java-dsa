//remove nth node from end problem



public class Linkedlistquestion{
   
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        Node head= null;
    // add - first , last
    public void addfist(int data){
        Node newnode = new Node(data);
       
        if(head==null){
         head = newnode;
         return;

        }

        newnode.next = head;
        head = newnode;
        
    }

    //add last
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
         head = newnode;
         return;

        }
        Node currNode = head;
        while(currNode.next != null){
            currNode= currNode.next;
        }
        currNode.next=newnode;
       
    }

    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
        }
         Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode= currNode.next;
        }
        System.out.print("null");
    }
   
   public void removenthfromend(int n){
    if(head.next == null){
        head=null;
        return;
    }
    int size=0;
    Node currNode = head;
    while(currNode != null){
       
        currNode = currNode.next;
           size++;
    }
    int indexsearch = size-n;
    Node preNode = head;
     int c= 1;
     while( c < indexsearch){
        preNode = preNode.next;
        c++;
     }
     preNode.next= preNode.next.next;

   }

  
    public static void main(String[] args) {
     Linkedlistquestion list = new Linkedlistquestion();
    list.addfist(5);
    list.addlast(4);
    list.addlast(3);
    list.addlast(2);
    list.addlast(1);
    list.printlist();
   list.removenthfromend(3);
   System.out.println();
   list.printlist();

    }
}




// check linked list is palidrom or not

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//  Given the head of a singly linked list, return true if it is a 
// palindrome
//  or false otherwise.
// class Solution {
//     public ListNode reverse(ListNode head){
//         ListNode pre = null;
//         ListNode curr = head;

//         while(curr != null){
//             ListNode next = curr.next;
//             curr.next= pre;
//             pre= curr;
//             curr= next;
//         }
        
//         return pre;
//     }

//     public ListNode  findmiddle(ListNode head){
//         ListNode hare = head;
//         ListNode turtel = head;

//         while(hare.next != null && hare.next.next != null){
//         hare= hare.next.next;
//         turtel = turtel.next;
//         }
//         return turtel;
//     }
//     public boolean isPalindrome(ListNode head) {
//        if(head==null || head.next == null){
//         return true;
//        } 

//      ListNode middle =  findmiddle(head);//first half end 

//     ListNode secondhalfstart= reverse(middle.next);
     
//      ListNode firsthalfstart = head;
//      while(secondhalfstart !=null){
//         if(firsthalfstart.val != secondhalfstart.val){
//             return false;
//         }
//         firsthalfstart=  firsthalfstart.next;
//         secondhalfstart = secondhalfstart.next;;

//      }
//      return true;

//     }
// }




// Cycle of a linked list
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         if(head==null){
//             return false;
//         }
//        ListNode hare = head;//fast
//        ListNode turtel = head;//slow
//        while(hare != null && hare.next != null){
//         hare= hare.next.next;
//         turtel= turtel.next;
//         if(hare == turtel){
//             return true;
//         }
//        }
//      return false;
//     }
// }