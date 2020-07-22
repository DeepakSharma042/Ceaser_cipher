import java.util.Scanner;

public class Ceaser_cipher {
    public static String encrypt_and_decrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);  
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key); 
        //  encrypt key = 3       DEFGHIJKLMNOPQRSTUVWXYZ + ABC 
        //  decrypt key = 23      XYZ + ABCDEFGHIJKLMNOPQRSTUVW
        
        for(int i = 0; i < encrypted.length(); i++) {   
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(Character.toUpperCase(currChar));
            if(idx != -1){
                if (currChar == Character.toUpperCase(currChar)){
                    char newChar = shiftedAlphabet.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
                else{
                   char newChar = shiftedAlphabet.charAt(idx);
                    encrypted.setCharAt(i, Character.toLowerCase(newChar)); 
                }
            }
         }
        return encrypted.toString();
    }
    
    public void textCeaserCipher(){
        System.out.println("Enter Message");;
            Scanner s = new Scanner(System.in);
            String message = s.nextLine();
            
            System.out.println("Enter key");;
            int key = s.nextInt();
            
            String encrypted = encrypt_and_decrypt(message, key); 
            System.out.println("Encrypted text is "+ encrypted);
            
            String decrypted = encrypt_and_decrypt(encrypted, 26-key);  
            System.out.println("Decypted text is "+decrypted);
    }
}
