import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        boolean programmRunning= true;
        while (programmRunning){
            System.out.println("Enter 1 for encryption and decryption 2 for exiting the program");
            String choice= bufferedReader.readLine();
            if(choice.equals("1")){
                System.out.println("Enter a plain text:");
                String txt= bufferedReader.readLine();
                System.out.println("Enter the key to use:");
                String key= bufferedReader.readLine();
                int intKey= Integer.parseInt(key);

                Encrypt enc= new Encrypt();
                Decrypt decc= new Decrypt();
                System.out.println("The encrypted text is: "+ enc.EncryptPlainText(txt, intKey));
                System.out.println("The decrypted text is: "+ decc.DecrptCipherText(txt,intKey) + "\n This is the word you've entered initially :) :)");
            }
            else if(choice.equals("2")){
                System.out.println("bye");
                programmRunning= false;
            }
            else
                System.out.println("invalid choice, Re-Enter the valid number!");
        }
    }
}
