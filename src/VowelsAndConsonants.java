import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main (String [] args){
        //Scanner scn = new Scanner(System.in);
        String str="udatha venkata sai *$lohitha3ksh2";
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch==' ') {
                continue;
            }
            if (ch >= 'A' && ch <= 'Z' || ch>='a' && ch<='z' ) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'||ch=='E' || ch=='I' || ch=='O'||ch=='U') {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }

        }
       System.out.println("there are " +vowels+" number of vowels and "+consonants+" number of consonants are present in "+str);
    }
}
