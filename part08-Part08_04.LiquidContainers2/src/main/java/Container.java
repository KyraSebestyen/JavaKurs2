public class Container {

    private int content;

    public Container() {
        this.content = 0;
    }

    public int contains() {
        return content;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (content + amount <= 100) {
                content += amount;
            } else {
                content = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (content - amount >= 0) {
                content -= amount;
            } else {
                content = 0;
            }
        }
    }

    @Override
    public String toString() {
        return content + "/100";
    }
}
