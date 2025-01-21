package Question2016;

import java.io.*;
public class Q4 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\InputAndOutput\\Q4 (1).txt"));
            String line;
            while((line = reader.readLine()) != null){
                if(strength(line)){
                    System.out.print("\nStrong password.");
                }else{
                    System.out.print("\nNot a strong password.");
                }
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.print("\nFile cannot found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
    }
    public static boolean strength(String password) {
    boolean length = password.length() >= 8;
    boolean uppercase = false;
    boolean lowercase = false;
    boolean digit = false;
    boolean specialCharacter = false;

    for (int i = 0; i < password.length(); i++) {
        char ch = password.charAt(i);

        if (Character.isUpperCase(ch)) {
            uppercase = true;
        } else if (Character.isLowerCase(ch)) {
            lowercase = true;
        } else if (Character.isDigit(ch)) {
            digit = true;
        } else if (!Character.isLetterOrDigit(ch) && ch != ' ') {
            specialCharacter = true;
        }
    }

    return length && uppercase && lowercase && digit && specialCharacter;
}

}
