from Employee import Employee

class Employees:
    def __init__(self):
        self.listOfEmployees   = []

    # void add(Employee)
    # adds an employee to Employees
    def add(self, e):
        self.listOfEmployees.append(e)

    def __str__(self):
        stringToReturn = ""
        for e in self.listOfEmployees:
            stringToReturn = stringToReturn + str(e)
        return(stringToReturn)

if __name__ == "__main__":
    employee1 = Employee("Jaime", "Amherst", "111-111-1111", "CICS", 15)
    sample = Employees()
    sample.add(employee1)
    sample.add(Employee("Maria", "Stow", "222-222-2222", "somewhere", 50))
    sample.add(Employee("Jaime", "Amherst", "111-111-1111", "CICS", 15))
    #print(sample)
    

    
