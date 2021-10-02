public class Assignment13 {
    public static void main(String[] args) {
        int j=2;
        for(int i=10;i<=99;i++){
            for(j=2;j<=i/2;j++){
                if(i%j == 0){
                    break;
                }
            }
            if(j>i/2 || j == 1){
                System.out.print(i+" ");
            }
        }
    }
}
