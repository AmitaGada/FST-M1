exmaple_tuple = (2, 5, 9, 10, 24, 30, 44, 105, 115, 99)
tuple = ()
List = []

for item in exmaple_tuple:
    if item%5 == 0:
        List.append(item)
print ("Numbers in tuple which are divisible by 5 are: ", List)