class Person:
    def __init__(self, newName="none", address="none", phone="999-999-9999"):
        self.name = newName
        self.address = address
        self.phone = phone

    def setName(self, name):
        self.name = name

    def getName(self):
        return(self.name)

    def getPhone(self):
        return(self.phone)
    
    def __str__(self):
        stringtoReturn = "Name         : " + self.name \
                       + "\naddress      : " + self.address \
                       + "\nphone        : " + self.phone 
        return(stringtoReturn)
