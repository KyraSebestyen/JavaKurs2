import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    List<T> inPipe = new ArrayList<>();

    public Pipe() {
    }

    public void putIntoPipe(T value){
        inPipe.add(value);
    }

    public T takeFromPipe(){
        if(inPipe.isEmpty()){
            return null;
        }
        T current = inPipe.get(0);
        inPipe.remove(0);
        return current;
    }

    public boolean isInPipe(){
        return !inPipe.isEmpty();
    }
}
