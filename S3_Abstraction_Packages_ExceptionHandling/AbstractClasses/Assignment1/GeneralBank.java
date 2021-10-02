abstract class GeneralBank{

    GeneralBank(){
        System.out.println("Inside General Bank");
    }
    
    abstract void getSavingsInterestRates();

    abstract void getFixedDepositInterestRates();
}