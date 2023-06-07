from operator import indexOf
import random

class Person:
    def __init__(self, newName="none", address="none", phone="999-999-9999"):
        self.name = newName
        self.address = address
        self.phone = phone

    def setName(self, name):
        self.name = name

    def getName(self):
        return(self.name)

    def __str__(self):
        stringtoReturn = "Name         : " + self.name \
                       + "\naddress      : " + self.address \
                       + "\nphone        : " + self.phone 
        return(stringtoReturn)

    def getData(self):
        self.name         = input("Enter name                         : ")
        self.address      = input("Enter address                      : ")
        self.phone        = input("Entr phone (in xxx-xxx-xxxx format): " )


if __name__=="__main__":
    samplePerson = Person("Jaime", "Malibu Beach", "111-222-3333")
    print(samplePerson)

