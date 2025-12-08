import pandas

#Print the number of rows and columns
df = pandas.read_excel("emp.xlsx", sheet_name='Sheet1')

num_rows, num_cols = df.shape

print(f"Number of rows: {num_rows}")
print(f"Number of columns: {num_rows}")

#Print the data in the emails column only
print(df["Email"])

#Sort the data based on FirstName in ascending order and print the data

sorted_df = df.sort_values(by="FirstName", ascending=True)

print(sorted_df)