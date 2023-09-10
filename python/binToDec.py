def factor(a):
    if(a==1):
        return 1
    i=2
    while(a%i!=0):
        i=i+1
    return i
# print(factor(1))
def binToDec(n):
    if(n==1):
        return
    f=factor(n)
    print(f,end=" ")
    binToDec(n/f)
binToDec(77)
print()
