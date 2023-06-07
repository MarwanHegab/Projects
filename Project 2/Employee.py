# this version of class Employee DOES NOT inherit from class Person.
# It is included in today's materials as part of the exercise
# in having objects inside objects
# (in this case, objects of class Employee inside objects of class Employees)
# for an example on inheritance, take a look at
# Person.py and Student.py
class Employee:
    def __init__(self, newName="none", address="none", phone="999-999-9999", department="none", salary=15):
        self.name = newName
        self.address = address
        self.phone = phone
        self.department = department
        self.hourlySalary = salary

    def setName(self, name):
        self.name = name

    def getName(self):
        return(self.name)
    
    def __eq__(self, theOtherObject):
        return(self.getName() == theOtherObject.getName())

    # the version we saw in class was not exactly this one,
    # but this one is closer to the one you developed
    # during our previous lab
    def __str__(self):
        return ("Name   : " + self.name + "\nSalary : " + str(self.hourlySalary) + "\naddress: " + self.address + "\n")

if __name__ == "__main__":
    employee1 = Employee("Jaime", "Amherst", "111-111-1111", "CICS", 15)
    employee2 = Employee("Maria", "Amherst", "111-111-1111", "CICS", 15)
    print(employee1==employee2)






