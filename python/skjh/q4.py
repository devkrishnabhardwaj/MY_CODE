#fibonacci series using recursion
def fibo(n,t1=0,t2=1):
    if t1==0:
        print(0,end=" ")
    if n == 0:
        return
    print(t2,end=" ")
    fibo(n-1,t2,t1+t2)
fibo(10)
print()