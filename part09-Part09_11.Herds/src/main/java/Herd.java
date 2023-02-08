import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> objectsInHerd = new ArrayList<>();

    public void addToHerd(Movable movable){
        objectsInHerd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable object : objectsInHerd){
            object.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Movable object : objectsInHerd){
            sb.append(object.toString()).append("\n");
        }
        return sb.toString();
    }
}
