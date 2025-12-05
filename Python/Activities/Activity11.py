example_dict = {
    "apple": 100,
    "banana": 40,
    "orange": 80,
    "pear": 200,
    "grapes": 70
}

keyToCheck = input("Which fruit you are looking for?").lower()

if keyToCheck in example_dict:
    print("Yes, fruit is available")
else:
    print("No, fruit is not available")