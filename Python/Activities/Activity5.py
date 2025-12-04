x = int(input("Enter a number for which you want to write multiplication table: "))
for i in range(1, 10, 1):
    num = x * i
    print (f"{x} * {i}:  {num}")