import java.util.HashMap;
import java.util.Map;

public class Practise {
    public static void main(String[] args) {
       /* int[] arr = {8,6,9,5,8,6,7,5,9};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j <arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println("The unique number: " +arr[i]);
            }
        }*/

          /*      int space,spaceLimit=0;
           for(int i=0;i<=4;i++) {
            for ( space = 0; space <spaceLimit; space++)
                System.out.print(" ");
                for(int j=i;j<=4;j++)
                    System.out.print("* " );
                    System.out.print("\n");
                    spaceLimit =spaceLimit + 2;

        }*/
       String n ="*";
       int length =4;
       for(int i=0;i<=length;i++){
           for(int j=0;j<=length;j++){
               if ((i == j) || (i == length -j) ){
                   System.out.print(n);
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println(" ");
       }
    }

    }

