public class Highest {
    public static void main (String[]args){
        int arr[]={8,112,134,264,365,223,245};
        int maxDist=0;
        int guffonSix=0;
        for(int i =0;i< arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    maxDist=arr[i];
                    guffonSix=maxDist+1;
                }
            }
        }
        System.out.println("the largest six want to hit by guffon = " +guffonSix);
    }
}
