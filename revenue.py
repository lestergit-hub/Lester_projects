
sell =  float(input("How much money are you selling it for? "))
cost = float(input("How much did this cost you? "))
ebaycost = sell*.10
profit = sell-(cost+ebaycost)

 

print("You made $" + str(profit)+" profit ")



