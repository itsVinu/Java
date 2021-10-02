import java.util.ArrayList;

public class MyList<E> extends ArrayList<E> {
    @Override
    public boolean add(E e){
        if(e instanceof Integer || e instanceof Float || e instanceof Double){
            super.add(e);
            return true;
        }
        else{
            throw new ClassCastException("Only int, double or float allowed");
        }
    }
}
