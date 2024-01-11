import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
    public static void main(String[] args) throws IOException {

        String str1;
        boolean check = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program checks if the word is a palindrome");
        System.out.println("Enter a word to be checked");
        str1 = br.readLine().toLowerCase();

        for(int i = 0; i < str1.length()/2; i++ ){
            if(str1.charAt(i) != str1.charAt(str1.length() - i - 1)){
                System.out.println("It is not a palindrome");
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " it is not a palindrome");
        }
    }
}
