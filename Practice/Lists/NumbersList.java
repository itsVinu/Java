import java.util.ArrayList;

public class NumbersList<Object> extends ArrayList<Object>{
    @Override
    public boolean add(Object e){
        if(e instanceof Integer || e instanceof Double || e instanceof Float){
            super.add(e);
            return true;
        }
        else{
            throw new ClassCastException("Data type is not of type number");
        }
    }
}
