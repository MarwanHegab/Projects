
public class Person {
    private String name;
    private String address;
    private String phone;

    public Person(String newName, String address, String phone) {
        this.name = newName;
        this.address = address;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public String getPhone() {
        return this.phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }
}
