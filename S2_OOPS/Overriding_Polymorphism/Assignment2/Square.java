
class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
    public void erase(){
        System.out.println("Erasing Square");
    }

    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}
