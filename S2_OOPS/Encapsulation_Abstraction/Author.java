
public class Author {
    String name;
    String email;
    char gender;
    
    public Author(String n,String e, String g){
        this.name=n;
        this.email = e;
        this.gender = g.charAt(0);
    }

}
