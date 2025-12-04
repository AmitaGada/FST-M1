Player1 = input ("Enter player1's name: ")
Player2 = input ("Enter player2's name: ")

while True:
    Player1_action = input( Player1 + ", do you want to choose rock, paper or scissors? ")
    Player2_action = input( Player2 + ", do you want to choose rock, paper or scissors? ")

    if Player1_action == Player2_action:
        print ("It is a tie")
    elif Player1_action == 'rock':
        if (Player2_action == 'scissors'):
            print("rock wins")
        else:
            print ("paper wins")
    elif Player1_action == 'scissors':
        if (Player2_action == 'paper'):
            print("sessiors wins")
        else:
            print("rock wins")
    elif Player1_action == 'paper':
        if (Player2_action == 'scissors'):
            print("scissors wins")
        else:
            print("rock wins")
    else:
        print("enter the valid input")

    repeat = input("Do you want to play another round? Yes/No: ")
    
    # If they say yes, don't do anything
    if(repeat == "yes"):
        pass
    # If they say no, exit the game
    elif(repeat == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit