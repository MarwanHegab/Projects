print("Solve: SLAYER + SLAYER + SLAYER = LAYERS")

n = int(input("What is your guess? "))

a = n + n + n

LAYERS = [int(((n // 10000) % 10)), int(((n // 1000) % 10)), int(((n // 100) % 10)), int(((n // 10) % 10)), int((n % 10)), int((n // 100000))]

one = (LAYERS[0])
two = (LAYERS[1])
three = (LAYERS[2]) 
four = (LAYERS[3])
five = (LAYERS[4])
six = (LAYERS[5])

b = int((str(one) + str(two) + str(three) + str(four) + str(five) + str(six)))

print(f"{b} == {a} -> {bool(a == b)}")