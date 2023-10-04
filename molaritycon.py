
look = (input("what are you lookinng for "))
if(look == "molar concentration"or look == "M"):
    moles = float(input("GIVE ME THE MOLES? "))
    liter = float(input("GIVE ME THE LITERS? "))
    print(str(moles/liter)+" Molar concentration")

if(look =="mol"):
    liter = float(input("GIVE ME THE LITERS? "))
    M = float(input("GIVE ME THE MOLES CONCENTRATION? "))
    print(str(M*liter)+" Moles")
if(look == "L"):
    M = float(input("GIVE ME THE MOLES CONCENTRATION? "))
    moles = float(input("GIVE ME THE MOLES? "))
    print(str(moles/M)+" liters")










    