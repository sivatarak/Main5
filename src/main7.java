import java.util.Scanner;

class main7{
    public static void main(String [] args){
       // Scanner scn = new Scanner(System.in);
        String str = "Si@va#";
        convertCases(str);
        System.out.println("The converting of alphabet cases gives " +convertCases(str));
    }
    public static String convertCases(String str){
        StringBuilder res =new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
          if  (ch >='A' && ch<='Z'){
               res.append((char)(ch+32));
          }
          else if (ch >='a' && ch<='z'){
              res.append((char)(ch-32));
          }
          else{
              res.append(ch);
          }
        }
        String result = res.toString();
        return result;
    }

}