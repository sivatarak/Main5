import java.util.ArrayList;
import java.util.List;

public class Key{
 public static void main(String[]args){
     int steps =5;
     int seaLevel=0;
     int valleyCount=0;
     String path[]={"U","D","D","D","D","U","U"};
     for(int i=0;i< path.length;i++){
         if (path[i]=="U"){
             seaLevel++;
         }
         if (path[i]=="D"){
             if (seaLevel==0){
                 valleyCount++;
             }
             seaLevel--;
         }
     }
     System.out.println(valleyCount);
 }
    }


