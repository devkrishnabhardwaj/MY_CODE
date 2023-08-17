# integer formatting

print(format(12345,'7d'),end = ' ')
print(format(7,'2d'))

# float formatting

a=1.11
b=0.01
c = format(a*b,'.2f')
print(c)

# exponential formatting

print(format(123456789,'.3e'))

# string formatting

print(format("Hello MF",'<11'))
print(format("Hello MF",'>11'))
print(format("Hello MF",'^11'))