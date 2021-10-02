public class SmallestLargest {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k=3;
        String smallest = s.substring(0,k);
        String largest = s.substring(0, k);

        for(int i=0;i<=s.length()-k;i++){
            if(s.substring(i,i+k).compareTo(smallest)<0){
                smallest = s.substring(i,i+k);
            }
            if(s.substring(i,i+k).compareTo(largest)>0){
                largest = s.substring(i,i+k);
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
