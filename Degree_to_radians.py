def simplify(num,dem):
    num = int(num)
    for i in range(1,num):
        for j in range(1,dem):
            if(i*dem == j*num):
                print(str(i)+"pie/"+str(j))
                exit()
ans = input("What do you have?")
if(ans == "Degrees"):
    deg = float(input("what is the degree?"))
    num = deg
    dem= 180
    print(simplify(num,dem))
    
if(ans =="Radians"):
    print("do not type pie on any of them")
    Radn = int(input("What is the radian numerator? "))
    Radd = int(input("What is the radian denominator? "))
    Radn = Radn*180
    if(Radd != 0):
        print(str(Radn/Radd)+" Degrees")
    else:
        print(Radn)