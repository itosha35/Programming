import math

def GetNumbers(s, p):
    d = s*s - 4*p
    if d < 0:
        return "Incorrect Input"
    else:
        if (s - math.sqrt(d)) <= 0:
            return "Incorrect Input"
        else:
            return "X = " + f"{int((s-math.sqrt(d))/2)}" + " Y = " + f"{int((s+math.sqrt(d))/2)}"

s = int(input("Please, set the Summ of the 2 Digits: "))
p = int(input("Please, set the Multiplication of the 2 Digits: "))
print('Digits are Integer '+'\n'+ GetNumbers(s, p))