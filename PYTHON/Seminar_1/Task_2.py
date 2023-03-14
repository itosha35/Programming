def summa(number):    
    if (number / 10 < 100) & (number / 10 >= 10):
        sum = number // 100 + (number % 100)//10 + number % 10
        return sum
    else:
        return -1

n = int(input("Please, set a 3 digits - Number = "))

if (summa(n) != -1):
    print("Summa of the digits of the number = ", + summa(n))
else:
    print("Wrong Input!")
