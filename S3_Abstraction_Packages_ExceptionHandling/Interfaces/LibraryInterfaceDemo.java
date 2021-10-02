
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        LibraryUser lu;
        lu = new AdultUser(13,"Fiction");

        lu.registerAccount();
        lu.requestBook();

        lu = new AdultUser(10, "Kids");
        lu.registerAccount();
        lu.requestBook();

        lu = new KidUsers(11, "Kids");
        lu.registerAccount();
        lu.requestBook();

    }
}
