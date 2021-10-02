
public class Book {
    String name;
    double price;
    int qtyInStock;
    Author author;

    public Book(String n, double p, int q,Author a){
        name = n;
        price = p;
        qtyInStock = q;
        author = a;
    }


    void setName(String n){
        name = n;
    }
    void setPrice(double p){
        price = p;
    }
    void setQty(int q){
        qtyInStock = q;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qtyInStock;
    }
    public Author getAuthor(){
        return author;
    }


    public static void main(String[] args) {
        Book b1 = new Book("Vampire Diaries",200.0,10,new Author("Aakash Gupta", "aakashgpt12321@gmail.com", "M"));

        System.out.println(
            "Book Name: "+b1.getName()+
            " , Book Price: "+b1.getPrice()+
            " , Book Quantity: "+b1.getQty()+
            "\nAuthor Name:"+b1.getAuthor().name+
            " , Author email: "+b1.getAuthor().email+
            " , Author gender: "+b1.getAuthor().gender
        );
    }

}
