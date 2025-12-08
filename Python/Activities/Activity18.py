import pandas

#Read the CSV made in the previous program:
dataframe=pandas.read_csv('userdetails.csv')
print(dataframe)

#Print the values only in the Usernames column
print(dataframe["username"])

#Print the username and password of the second row
row = dataframe.iloc[1]
print(row)

#Sort the Usernames column data in ascending order and print data
sortusername = dataframe.sort_values("username")
print(sortusername)

#Sort the Passwords column in descending order and print data
sortpassword = dataframe.sort_values("password", ascending=False)
print(sortpassword)