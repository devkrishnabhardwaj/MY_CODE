c = input("enter Character : ")
match c : 
    case 'o' :
        print("OutStanding")
    case 'a' :
        print("Excellent")
    case 'b' :
        print("Very Good")
    case 'c' :
        print("Good")
    case 'f' :
        print("Fail")
    case _ :
        print("Wrong Character")