def factor(a):
    if(a==1):
        return 1
    i=2
    while(a%i!=0):
        i=i+1
    return i
# print(factor(1))
def primeFactor(n):
    if(n==1):
        return
    f=factor(n)
    print(f,end=" ")
    primeFactor(n/f)
primeFactor(77)
print()
