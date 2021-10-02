class KotMBank extends GeneralBank{

    KotMBank(){
        System.out.println("Inside Kotak Mahindra Bank");
    }
    void getFixedDepositInterestRates(){
        System.out.println("9%");
    }
    void getSavingsInterestRates(){
        System.out.println("6%");
    }
    
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank();
        i.getFixedDepositInterestRates();
        i.getSavingsInterestRates();

        GeneralBank g;
        g = new ICICIBank();
        g.getFixedDepositInterestRates();
        g.getSavingsInterestRates();

        KotMBank k = new KotMBank();
        k.getFixedDepositInterestRates();
        k.getSavingsInterestRates();

        g = new KotMBank();
        g.getFixedDepositInterestRates();
        g.getSavingsInterestRates();
    }
}
