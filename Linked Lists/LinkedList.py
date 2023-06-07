from Node import Node
from Person import Person
class LinkedList:
    def __init__(self):
        self.head = None
    
    def add(self, e):
        newNode = Node(e)
        if not self.head:
            self.head = newNode
            return
        node = self.head
        while node.next:
            node = node.next
        node.next = newNode
    
    def insert(self, index, e):
        newNode = Node(e)
        if index == 0:
            newNode.next = self.head
            self.head = newNode
            return
        node = self.head
        i = 0
        while i < index - 1:
            node = node.next
            i += 1
        newNode.next = node.next
        node.next = newNode
        
    def length(self):
        i = 0
        node = self.head
        while node:
            i += 1
            node = node.next
        return(int(i))
    
    def __getitem__(self, index):
        i = 0
        node = self.head
        while i < index:
            node = node.next
            i += 1
        return(node.data)

    def delete(self, index):
        if index < 0 or index >= self.length():
            pass
        elif index == 0:
            self.head = self.head.next
        else:
            node = self.head
            for i in range(index - 1):
                node = node.next
            if node.next.next is None:
                node.next = None
            else:
                node.next = node.next.next

    def search(self, name):
        node = self.head
        lst = LinkedList()
        while node:
            if node.data.getName() == name:
                lst.add(node.data)
            node = node.next
        return(lst)
    
    def __str__(self):
        current = self.head
        result = ""
        while current != None:
            result += str(current.getData()) + "\n"
            current = current.getNext()
        return result


if __name__=="__main__":
    linked_list = LinkedList()
    linked_list.add(Person("Marwan", "102 Eastman Lane", "617-909-8003"))
    linked_list.add(Person("Katie", "North Pleasant Street", "405-707-6060"))
    linked_list.add(Person("Charlie", "Thatcher Rode", "777-650-4004"))

    print(linked_list)

    linked_list.insert(0, Person("John", "Cherry Lane", "999-904-9007"))

    print(linked_list)
    
    linked_list.insert(2, Person("Louis", "Hobart Lane", "888-868-5005"))

    print(linked_list)

    linked_list.insert(5, Person("Sara", "Meadow Street", "617-584-2002"))

    print(linked_list)

    linked_list.delete(0)

    print(linked_list)

    linked_list.delete(2)

    print(linked_list)

    linked_list.delete(3)

    print(linked_list)
    