import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(person -> employees.add(person));
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            Education education1 = person.getEducation();
            if (education1 == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Education education1 = iterator.next().getEducation();
            if (education1 == education) {
                iterator.remove();
            }
        }
    }
}
