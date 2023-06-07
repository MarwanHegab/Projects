from unittest import *
from person import Person
from persons import Persons

if __name__=="__main__":
    samplePerson1 = Person("Marwan", "Amherst", "123-999-4567")
    print(samplePerson1)
    samplePerson2 = Person("Katie", "Cambridge", "606-8976-1001" )
    print(samplePerson2)

    samplePersons1 = Persons().delete(samplePerson1)
    print(assertEqual(samplePersons1, ''))
    samplePersons2 = Persons().delete(samplePerson2)
    print(assertEqual(samplePersons2, ''))