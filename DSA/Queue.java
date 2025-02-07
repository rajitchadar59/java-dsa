public class Queue {
    static class queue{
     static int arr[];
     static int size;
     static int r =-1;
    

        queue(int n){
            arr = new int[n];
            this.size = n;

        }

      public static boolean ismpty(){
        return r==-1;
      }  
     
      public static void enqueue(int data){
        if(r==size-1){
            System.out.println("queue is full cant insert an element");
            return;
        }
        r++;
        arr[r]=data;

      }

      public static int dequeue(){
        if(ismpty()){
            System.out.println("cant dequeue an element because  queue is empty!");
            return -1;

        }
        int f = arr[0];
        for(int i =0 ; i < r ; i++){
        arr[i]=arr[i+1];
        }
        r--;
        return f;
      }

     public static int peek(){
         if(ismpty()){
            System.out.println("cant peek an element because  queue is empty!");
            return -1;

        }
        int p = arr[0];
        return p;
     }




     }

    public static void main(String[] args) {
     queue q= new queue(4);
     q.enqueue(5);
     q.enqueue(10);

     while(!q.ismpty()){
     System.out.println(q.peek());
     q.dequeue();
     }

    }
}



   