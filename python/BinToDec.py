def binToDec(n):
    if n==0:
        return
    binToDec(n//2)
    print(n%2,end="")
binToDec(11)
print()
