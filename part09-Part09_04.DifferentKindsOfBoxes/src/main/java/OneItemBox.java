import java.util.ArrayList;

public class OneItemBox extends Box {

    private boolean holdsItem;
    private ArrayList<Item> items = new ArrayList<>();

    public OneItemBox() {
        holdsItem = false;
    }

    @Override
    public void add(Item item) {
        if(!holdsItem){
            items.add(item);
            holdsItem = true;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(items.contains(item)){
            return true;
        }
        return false;
    }
}
