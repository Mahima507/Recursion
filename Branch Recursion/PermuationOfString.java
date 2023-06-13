public class PermuationOfString {
    
static void perm(String str, String result) {
    // Termiation case  
    // If the input string is empty, print the result
    if (str.length() == 0) {
        System.out.println(result);
        return;
    }

   
    for (int i = 0; i < str.length(); i++) {
       
        char ch = str.charAt(i);
        String remaining = str.substring(0, i) + str.substring(i + 1);

        // Recursive call with the updated string and result
        perm(remaining, result + ch);
    }
}
public static void main(String[] args) {
    System.out.println( "Permuation of the String abc :- ");
    perm("abc","");
}
}