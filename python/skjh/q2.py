str=input("Write Something :\n")
upp=0
low=0
num=0
uppCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
lowCase = "abcdefghijklmnopqrstuvwxyz"
number = "1234567890"
for i in str:
    if i in uppCase :
        upp +=1
    elif i in lowCase :
        low +=1
    elif i in number:
        num +=1
print("Upper Case = ",upp)
print("Lower Case = ",low)
print("Numbers = ",num)
