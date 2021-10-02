import java.lang.Math;

class TestCompartment {
    public static void main(String[] args) {
        Compartment [] c = new Compartment[10];

        int randomNumber =(int) Math.floor(Math.random()*4)+1;

        System.out.println(randomNumber);

        if(randomNumber == 1){
            for(int i=0;i<3;i++){
                c[i] = new FirstClass();
                System.out.println(c[i].notice());
            }
            FirstClass f = new FirstClass();
            System.out.println(f.notice());
        }
        else if(randomNumber == 2){
            for(int i=3;i<5;i++){
                c[i] = new Ladies();
                System.out.println(c[i].notice());
            }
            Ladies l = new Ladies();
            System.out.println(l.notice());
        }
        else if(randomNumber == 3){
            for(int i=5;i<8;i++){
                c[i] = new General();
                System.out.println(c[i].notice());
            }
            General g = new General();
            System.out.println(g.notice());
        }
        else{
            for(int i=8;i<10;i++){
                c[i] = new Luggage();
                System.out.println(c[i].notice());
            }
            Luggage l = new Luggage();
            System.out.println(l.notice());
        }
    }
}
