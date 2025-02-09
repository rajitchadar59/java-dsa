public class Backtracking{
    public static void permutation(String str ,String per  ){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
    for(int i =0 ; i< str.length() ;i++){
     char  currentchar = str.charAt(i);
     String newstr =str.substring(0,i)+str.substring(i+1);
     
     permutation(newstr,per+currentchar);
    }
    }
    public static void main(String[] args) {
       String str="abc"; 
       permutation(str,"");
    }
}