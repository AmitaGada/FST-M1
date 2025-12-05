List = input("Enter a sequence of comma separated values: ").split(", ")

sum = 0
for num in List:
    sum += int(num)

print(sum)