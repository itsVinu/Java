package test;

public class Foundation {

    public Foundation(int var1,int var2,int var3,int var4){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    private int var1;  // NOT ACCESSIBLE OUTSIDE CLASS
    int var2;  //ACCESSIBLE WITHIN SUB-CLASSES AND PACKAGE
    protected int var3; // ACCESSIBLE WITHIN SUB-CLASSES
    public int var4;  //ACCESSIBLE EVERYWHERE
}
