str=input("Write Something :\n")
upp=0
low=0
num=0
for i in str:
    if i.isalpha() :
        if i.isupper():
            upp +=1
        elif i.islower():
            low +=1
    elif i.isnumeric():
        num +=1
print("Upper Case = ",upp)
print("Lower Case = ",low)
print("Numbers = ",num)
