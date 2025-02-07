public class Strings {
    public static void main(String[] args) {
        // String name = "rajit";
        // String fullname = "rajit chadar";
        // String sentence = " my name is rajit chadar";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);


        //functios in string
        // concatenation
        String fn= "Rajit";
        String ln="Chadar";
        String fullname = fn+ln;
        // System.out.println(fullname);

        //string length
        // System.out.println(fullname.length());

        //charAt
        // for(int i = 0 ; i <fullname.length() ; i++){
        //     System.out.println(fullname.charAt(i));
        // }


       //Compare two Strings
       String name1 = "tony23";
       String name2 = "Tony2";
       //s1 >s2 : +ve
       //s1== s2 : 0
       //s1 < s2 : -ve
    //   if(name1.compareTo(name2)==0){
    //     System.out.println("equal");
    //   }
    //   else{
    //     System.out.println("not equal");
    //   }
  
      // we not use == because sometimes it arise wrong answar
    //   if(new String("rajit")== new String("rajit")){
    //     System.out.println("==");
    //   }
    //   else{
    //     System.out.println("!=");
    //   }







             //SUB STRING

    String sentence = "mynameisrajit ";
    String name = sentence.substring(8 ,sentence.length());
    System.out.println(name);

    }
}
