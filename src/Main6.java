 class Number {
     public static void main(String[] args) {
         int[] arr = {3,24,78,2,19,55};
         thirdLargestNumber(arr);
     }

     public static void thirdLargestNumber(int[] arr) {
         if (arr.length < 3) {
             System.out.println("the array size is less than 3");
         }
         int first = 0;
         int second = 0;
         int third = 0;
         for (int i = 0; i < arr.length; i++) {
             int temp = arr[i];
             if (first < temp) {
                 third = second;
                 second = first;
                 first = temp;
             } else if (second < temp) {
                 third = second;
                 second = temp;
             } else if (third < temp) {
                 third = temp;

             }

         }
         System.out.println("the third largest number in array is " +third+ " second largest " +second+ " the largest number " +first);
     }
 }