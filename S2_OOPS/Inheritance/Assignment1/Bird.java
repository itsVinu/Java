class Bird extends Animal {
    public void fly(){
        System.out.println("Birds can fly");
    }
    @Override
    public void eat(){
        System.out.println("Birds can eat");
    }
    @Override
    public void sleep(){
        System.out.println("Birds can sleep");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();

        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}
