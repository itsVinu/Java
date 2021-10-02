import java.util.Scanner;

class AsciiToChars{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for (int i : arr) {
            System.out.println((char)i);
        }
    }
}