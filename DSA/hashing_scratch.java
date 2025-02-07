import java.util.*;
public class hashing_scratch{
    static class cHashMap<K,V> { //generics
    private class Node {
     K key;
     V value;

   public Node(K key, V value) {
   this.key = key;
   this.value = value;
   }
}
private int n; //n - nodes
private int N; //N - buckets
private LinkedList<Node> buckets[]; //N = buckets.length
@SuppressWarnings("unchecked")
 public cHashMap() {
 this.N = 4;
 this.buckets = new LinkedList[4];
 for(int i=0; i<4; i++) {
 this.buckets[i] = new LinkedList<>();
  }
 }
 private int hashFunction(K key){
 int bi=key.hashCode();
 return Math.abs(bi)%N;

 }

 private int searchInLL(K key ,int bi){
  LinkedList<Node> ll = buckets[bi]; 
 
  for(int i =0 ; i <ll.size() ;i++){
    if(ll.get(i).key== key){
        return i;

    }
  }
  return -1;
 }
 private void rehash(){
   LinkedList<Node> oldbukket[]=buckets;
   buckets= new LinkedList[N*2];
   for(int i=0 ; i <N*2 ; i++){
    buckets[i]=new LinkedList<>();
   }
   for(int i =0 ; i <oldbukket.length ;i++){
    LinkedList<Node> ll = oldbukket[i];
    for(int j =0 ; j < ll.size() ; j++){
     Node node = ll.get(j);
     put(node.key , node.value);

    }
   }

 }
 public void put(K key ,V value){
  int bi = hashFunction(key);
  int di=  searchInLL(key,bi);//dataindex==valid(0+)
  if(di==-1){//key doesnt exits
  buckets[bi].add(new Node(key ,value));
  n++;
  }
  else{//key exits
 Node node = buckets[bi].get(di);
 node.value=value;

  }
  double lambda = (double)n/N;
  if(lambda >2.0){
   rehash();
  }
 }

 public V get(K key){
  int bi = hashFunction(key);
  int di=  searchInLL(key,bi);//dataindex==valid(0+)
  if(di==-1){//key doesnt exits
  return null;
  }
  else{//key exits
 Node node = buckets[bi].get(di);
return  node.value;

  }

 }
 public boolean  containsKey(K key){
    int bi = hashFunction(key);
    int di=  searchInLL(key,bi);//dataindex==valid(0+)
  if(di==-1){//key doesnt exits
 return false;
  }
  else{//key exits
return true;

  }
 }

 public V remove(K key){
  int bi = hashFunction(key);
    int di=  searchInLL(key,bi);//dataindex==valid(0+)
  if(di==-1){//key doesnt exits
 return null;

  }
  else{//key exits
LinkedList<Node> ll = buckets[bi];
  Node node = buckets[bi].remove(di);
  n--;
  return node.value;
  }
 }
 public boolean  isempty(){
   return n==0; 
 }

 public ArrayList<K> keySet(){
    ArrayList<K> keys = new ArrayList<>();
     for(int i =0 ; i <buckets.length  ;i++){
      LinkedList<Node> ll = buckets[i];
      for(int j = 0; j < ll.size(); j++){
        Node node = ll.get(j);
        keys.add(node.key);
      }
     }
     return keys;

 }
   
 }
 public static void main(String[] args) {
     cHashMap<String, Integer> map = new cHashMap<>();
     map.put("one", 1);
     map.put("two", 2);
     map.put("three", 3);
     ArrayList<String> keys = map.keySet();
     for(int i =0 ; i <keys.size() ;i++){
        System.out.println(keys.get(i)+":"+map.get(keys.get(i)));
     }
}
}
