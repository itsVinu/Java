public class Assignment14 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please enter an integer number");
        }
        else{
            int n = Integer.parseInt(args[0]);
            if(n == 1 || n == 0){
                System.out.printf("%d is neither prime nor composite",n);
            }
            else{
                int i=2;
                for(;i<=n/2;i++){
                    if(n%i == 0){
                        System.out.println(n+" is not a prime number");
                        break;
                    }
                }
                if(i>n/2){
                    System.out.println(n+" is a prime number");
                }
            }
        }
    }
}
