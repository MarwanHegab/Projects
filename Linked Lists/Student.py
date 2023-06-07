from Person import Person
class Student(Person):
    def __init__(self, newName="none", address="none", phone="999-999-9999", year=9999):
        super().__init__(newName, address, phone)
        self.year = year

    def getGraduationYear(self):
        return(self.year)
    
    def setGraduationYear(self, year):
        self.year = year
    
    def __str__(self):
        stringtoReturn = "Name         : " + self.name \
                       + "\naddress      : " + self.address \
                       + "\nphone        : " + self.phone \
                       + "\nyear   : " + self.year
        return(stringtoReturn)
    