
List1 = [12, 20, 32, 33, 45, 46, 9, 7, 8]
List2 = [1, 18, 19, 3, 6, 49, 96, 0, 5, 8]
List3 = []
List4 = []
NewList = []

for num1 in List1:
    if num1%2 == 0:
        List3.append(num1)
print("Even Numbers from List1: ", List3)

for num2 in List2:
    if num2%3 == 0:
       List4.append(num2)
print("Odd Numbers from List2: ", List4)

NewList = List1 + List2
print ("New List: ", NewList)