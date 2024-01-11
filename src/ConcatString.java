import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcatString {
    public static void main(String[] args) throws IOException {

        String str1, str2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program concatenate two Strings");
        System.out.println("Enter the first String");
        str1 = br.readLine();

        System.out.println("Enter the second String");
        str2 = br.readLine();

        System.out.println(str1 + " + " + str2 + " = " + str1.concat(str2));
        System.out.println(str2 + " + " + str1 + " = " + str2.concat(str1));

        if(str1.equals(str2)){
            System.out.println("The concatenate of two different Strings is alternate");
        } else {
            System.out.println("The concatenate of two different Strings is no alternate");
        }

    }
}
