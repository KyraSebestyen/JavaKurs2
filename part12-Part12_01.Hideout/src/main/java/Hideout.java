public class Hideout<T> {

    T hidden;

    public Hideout() {
        this.hidden = null;
    }

    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }

    public T takeFromHideout() {
        T currentlyHidden = this.hidden;
        this.hidden = null;
        return currentlyHidden;
    }

    public boolean isInHideout() {
        return this.hidden != null;
    }
}
