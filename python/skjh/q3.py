n=int(input("Enter value of N : "))
sum = 0
for i in range(1,n+1):
    sum += (i*i)/i
print("sum of series is :",sum)