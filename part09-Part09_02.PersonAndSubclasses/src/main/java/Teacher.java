public class Teacher extends Person{

    private int wage;

    public Teacher(String name, String address, int wage) {
        super(name, address);
        this.wage = wage;
    }

    @Override
    public String toString(){
        return super.toString() + "\n  salary " + wage + " euro/month";
    }
}
