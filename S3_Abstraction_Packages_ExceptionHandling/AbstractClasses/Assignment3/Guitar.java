class Guitar extends Instrument{
    void play(){
        System.out.println("Guitar is playing tin tin tin");
    }

    public static void main(String[] args) {
        Instrument [] ins = new Instrument[10];

        int i=0;

        for(;i<3;i++){
            ins[i] = new Piano();
        }
        for(;i<6;i++){
            ins[i] = new Flute();
        }
        for(;i<10;i++){
            ins[i] = new Guitar();
        }
        Piano p = new Piano();
        p.play();
        ins[0].play();

        Flute f = new Flute();
        f.play();
        ins[3].play();

        Guitar g = new Guitar();
        g.play();
        ins[8].play();
    }
}
