
class Main {
    public static void main(String[] args) {
        String str1 = "life";
        char str[] = str1.toCharArray();
        int n = str.length;
        String str2 = "file";
        char stri[] = str2.toCharArray();
        int m = stri.length;
        int count = 1;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m; j++) {
                if (str[i] == stri[j]) {
                    count++;
                    i++;
                    j = 0;
                }
            }
            if (count == n-1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
