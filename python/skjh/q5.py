# gcd of two numbers
def gcd(a,b):
    if b == 0:
        return a
    return gcd(b,a%b)
a=gcd(70,10)
print(a)