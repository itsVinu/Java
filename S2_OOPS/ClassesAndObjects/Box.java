
class Box{
    private int width;
    private int height;
    private int depth;

    public Box(int w,int h,int d){
        width = w;
        height = h;
        depth = d;
    }

    public int volume(){
        int volume = this.height*this.width*this.depth;
        return volume;
    }

    public static void main(String[] args) {
        Box b1 = new Box(2,3,4);
        int v = b1.volume();

        System.out.println("Volume of box is: "+v);
    }
}