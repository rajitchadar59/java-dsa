   public class Queuecir {
    static class queue{
     static int arr[];
     static int size;
     static int r =0;
     static int f =0;


        queue(int n){
            arr = new int[n];
            this.size = n;

        }

      public static boolean ismpty(){
        return f==r;
      }  
      public static boolean  isfull(){
        return (r+1)%size == f;
      }
     
      public static void enqueue(int data){
        if(isfull()){
            System.out.println("queue is full cant insert an element");
            return;
        }
        
        r= (r+1)%size;
        arr[r]=data;

      }

      public static int dequeue(){
        if(ismpty()){
            System.out.println("cant dequeue an element because  queue is empty!");
            return -1;

        }
        f= (f+1)%size;
        int a = arr[f];
        return a;

      }

 

     }

    public static void main(String[] args) {
     queue q= new queue(4);
     q.enqueue(5);
     q.enqueue(10);
     q.enqueue(5);
     q.enqueue(5);
     q.enqueue(5);
     q.enqueue(5);
    }
}