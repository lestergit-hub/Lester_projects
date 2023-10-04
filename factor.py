su = 0
xsq = int(input("What is the A "))
c = int(input("What number is c "))
b= int(input("What is b "))
nf= xsq*c
sum = 0
print(nf)
di=[]
for i in range (-1000,1000):
    di.append(i)
for d in(di):
    for n in(di):
        su = (d*n)
        if(su == nf and d+n == b):
            sum = sum+1
            print(d,n)
print("Combination are",sum )