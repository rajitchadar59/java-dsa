// public class Stringbuilder{
//     public static void main(String[] args) {
//     //     StringBuilder sb = new StringBuilder("rajit");
//     //     System.out.println(sb);

//     //     System.out.println(sb.charAt(0));
//     //     //functions 
//     //     //set char
//     //    sb.setCharAt(0, 'p');
//     //    System.out.println(sb);
//     //    //insert 
//     //    sb.insert(0 ,'s');
//     //    System.out.println(sb);
//     //    sb.insert(1, 'p');
//     //     System.out.println(sb);

//     //     //delete
//     //     sb.delete(0 ,3);
//     //     System.out.println(sb);



//      //append
//         // StringBuilder sb = new StringBuilder("h");
//         // sb.append("e");
//         // sb.append("l");
//         // sb.append("l");
//         // sb.append('o');
//         // System.out.println(sb);
//     }
// }




//reverse a string question

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        for (int i = 0; i < s.length() / 2; i++) {
            int front = i;
            int back = s.length() - 1 - i;

            // Swap the characters at indices front and back
            char fc = s.charAt(front);
            char bc = s.charAt(back);

            s.setCharAt(front, bc);
            s.setCharAt(back, fc);
        }
        System.out.println(s);
    }
}
