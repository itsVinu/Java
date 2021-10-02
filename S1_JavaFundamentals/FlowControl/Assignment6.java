class Assignment6 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]);

        if(args[0].equals("Male")){
            if(age>1 && age<=58){
                System.out.println("the percentage of intrest is 8.4%");
            }
            else{
                System.out.println("the percentage of intrest is 10.5%");
            }
        }
        else{
            if(age>1 && age<=58){
                System.out.println("the percentage of intrest is 8.2%");
            }
            else{
                System.out.println("the percentage of intrest is 9.2%");
            }
        }
    }
}
