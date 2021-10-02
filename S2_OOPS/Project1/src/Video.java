public class Video {

    private String videoName;
    private int rating;
    private boolean checkout;

    public Video(String name){
        videoName = name;
    }

    public String getName(){
        return videoName;
    }

    public void doCheckout(){
        checkout = true;
    }
    public void doReturn(){
        checkout = false;
    }

    public void recieveRating(int rating){
        this.rating = rating;
    }
    public int getRating(){
        return rating;
    }
    public boolean getCheckout(){
        return checkout;
    }
}
