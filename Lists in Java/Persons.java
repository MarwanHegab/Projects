import java.util.ArrayList;
import java.util.Iterator;

public class Persons {
    private ArrayList<Person> personList;
    private int count;
    
    public Persons() {
        personList = new ArrayList<>();
        count = 0;
    }
    
    public ArrayList<Person> getInternalList() {
        return this.personList;
    }

    public Persons search(String name) {
        Persons matches = new Persons();
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                matches.add(person);
            }
        }
        return matches;
    }
    
    public void add(Person person) {
        personList.add(person);
        count++;
    }
    
    public int getSize() {
        return count;
    }
    
    public void delete(int i) {
        if (i >= 0 && i < count) {
            personList.remove(i);
            count--;
        } else {
            System.out.println("Invalid index.");
        }
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
