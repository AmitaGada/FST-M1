import pandas
data = {
    "username": ["admin", "Charles", "Deku"],
    "password": ["password", "Charl13", "AllMight"]
}

	
DataFrame = pandas.DataFrame(data)

DataFrame.to_csv("userdetails.csv")