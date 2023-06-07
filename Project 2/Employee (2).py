# this version of class Employee DOES NOT inherit from class Person.
# It is included in today's materials as part of the exercise
# in having objects inside objects
# (in this case, objects of class Employee inside objects of class Employees)
# for an example on inheritance, take a look at
# Person.py and Student.py

# This code is incomplete. We will complete it next Tuesday.
def binarySearch(aList, whatImLookingFor):
    lowLimit = 0
    highLimit = len(aList)-1
    while(lowLimit<=highLimit):
        middle = (lowLimit+highLimit)//2
        if (aList[middle] == whatImLookingFor):
            return(True)
        else:
            if (whatImLookingFor > aList[middle]):
                pass

# function search
    # inputs: a list of Employee objects, and a string
    # returns a list of Employee objects with a name equal to the string
    # Employee[] search(list, string)
def search(aList, whatImLookingFor):
        listToReturn = []
        for e in aList:
            if (e.getName() == whatImLookingFor):
                listToReturn.append(e)
        return(listToReturn)


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

    
    def __str__(self):
        return ("Name   : " + self.name + "\nSalary : " + str(self.hourlySalary) + "\naddress: " + self.address + "\n")

if __name__ == "__main__":
    employee1 = Employee("Jaime", "Amherst", "111-111-1111", "CICS", 15)
    employee2 = Employee("Maria", "Amherst", "111-111-1111", "CICS", 15)
    print(employee1==employee2)
    employeeList = []
    employeeList.append(employee1)
    employeeList.append(employee2)
    employeeList.append((Employee("Esteban", "Peru", "222-222-2222", 88)))
    stringForTesting = ""
    for e in employeeList:
        stringForTesting = stringForTesting + str(e)
    print(stringForTesting)

    print(search(employeeList, "Maria"))
    print(search(employeeList, "Jose"))



    
    

    







