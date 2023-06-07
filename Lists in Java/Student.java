
public class Student extends Person {
    private int graduationYear;

    public Student(String newName, String address, String phone, int year) {
        super(newName, address, phone);
        graduationYear = year;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int year) {
        graduationYear = year;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGraduation Year: " + graduationYear;
    }
}
