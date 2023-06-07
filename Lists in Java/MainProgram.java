import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        Persons persons = new Persons();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Enter option from list below:");
            System.out.println("1) Display complete directory");
            System.out.println("2) Enter new Person");
            System.out.println("3) Search for Person");
            System.out.println("4) Modify Person information");
            System.out.println("5) Delete a record");
            System.out.println("Q) Quit");
            System.out.print("Enter your option: ");
            String choice = input.nextLine().toUpperCase();

            switch (choice) {
                case "1":
                    displayDirectory(persons);
                    break;
                case "2":
                    enterNewPerson(persons, input);
                    break;
                case "3":
                    searchForPerson(persons, input);
                    break;
                case "4":
                    modifyPersonInformation(persons, input);
                    break;
                case "5":
                    deleteRecord(persons, input);
                    break;
                case "Q":
                    System.out.println("");
                    System.out.println("SYSTEM CLOSED");
                    System.out.println("");
                    System.exit(0);
                default:
                    System.out.println("");
                    System.out.println("Invalid value. Please choose another option from the list.");
                    break;
            }
        }
    }

//Display the directory/list of persons (Option 1)
    private static void displayDirectory(Persons persons) {
        System.out.println("");
        System.out.println(persons.getInternalList());
    }

//Enter a new record of a person (Option 2)
    private static void enterNewPerson(Persons persons, Scanner input) {
        System.out.println("");
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        System.out.print("Enter phone number: ");
        String phone = input.nextLine();

        System.out.print("Is this person a student? (y/n): ");
        String isStudent = input.nextLine().toLowerCase();
        if (isStudent.equals("y")) {
            System.out.print("Enter graduation year: ");
            int year = input.nextInt();
            input.nextLine(); 
            Person newPerson = new Student(name, address, phone, year);
            persons.add(newPerson);
        } else {
            System.out.print("Is this person an employee? (y/n): ");
            String isEmployee = input.nextLine().toLowerCase();
            if (isEmployee.equals("y")) {
                System.out.print("Enter department: ");
                String department = input.nextLine();
                Person newPerson = new Employee(name, address, phone, department);
                persons.add(newPerson);
            } else {
                Person newPerson = new Person(name, address, phone);
                persons.add(newPerson);
            }
        }
        System.out.println("");
        System.out.println(name + " has been added to the system!");
    }

//Search for a person (Option 3)
    private static void searchForPerson(Persons persons, Scanner input) {
        System.out.println("");
        System.out.print("Enter name to search: ");
        String name = input.nextLine();
        Persons searchResult = persons.search(name);
        System.out.println("");
        System.out.println(searchResult.getInternalList());
    }

//Delete the record of a person (Option 5)
    public static void deleteRecord(Persons persons, Scanner input) {
        System.out.println("");
        System.out.print("Enter the index of the record to delete: ");
        int index = -1;
        try {
            index = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            input.nextLine(); 
            return;
        }
        if (index < 0 || index >= persons.getSize()) {
            System.out.println("Invalid index. Please enter a number between 0 and " + (persons.getSize() - 1) + ".");
            return;
        }
        System.out.println("You have selected the following record:");
        System.out.println("");
        System.out.println(persons.getInternalList().get(index));
        System.out.println("");
        System.out.print("Are you sure you want to delete this record? (y/n): ");
        input.nextLine();
        String confirmation = input.nextLine().toLowerCase();
        if (confirmation.equals("y")) {
            persons.delete(index);
            System.out.println("Record deleted.");
        } else {
            System.out.println("Deletion canceled.");
        }
    }

//Modify the record of a person (Option 4)
    private static void modifyPersonInformation(Persons persons, Scanner input) {
        System.out.println("");
        System.out.println("Enter name to modify: ");
        String name = input.nextLine().toLowerCase();
        System.out.println("");
        Persons searchResult = persons.search(name);
        if (searchResult.getSize() == 0) {
            System.out.println("No person found with name " + name);
            return;
        }
        System.out.println(searchResult);
        for (int i = 0; i < searchResult.getSize(); i++) {
            System.out.println("");
            System.out.println("Do you want to modify this record? (y/n): ");
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("Enter new name: ");
                String newName = input.nextLine();
                Person p = searchResult.getInternalList().get(i);
                p.setName(newName);
                if (p instanceof Student) {
                    System.out.print("Enter new graduation year: ");
                    int year = input.nextInt();
                    ((Student) p).setGraduationYear(year);
                } else if (p instanceof Employee) {
                    System.out.print("Enter new department: ");
                    String department = input.nextLine().trim();
                    ((Employee) p).setDepartment(department);
                }
                System.out.println("Record modified:");
                System.out.println(p);
            } else if (choice.equals("n")) {
                System.out.println("Record not modified.");
            } else {
                System.out.println("Invalid choice. Record not modified.");
            }
        }
    }
}