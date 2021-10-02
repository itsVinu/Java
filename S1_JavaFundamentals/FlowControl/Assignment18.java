public class Assignment18 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please enter an integer number");
        }
        else{
            int n = Integer.parseInt(args[0]);
            int rev = 0;
            int temp = n;
            while(temp>0){
                rev = rev*10 + temp%10;
                temp = temp/10;
            }
            if(n == rev){
                System.out.printf("%d is a palindrome",n);
            }
            else{
                System.out.printf("%d is not a palindrome",n);
            }
        }
    }
}
