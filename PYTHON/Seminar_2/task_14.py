import math


def PowerOfTwo(number, pow):
    if math.pow(2, pow) <= number:
        print(f'Power = {pow} : Number = {int(math.pow(2, pow))}')
        PowerOfTwo(number, pow+1)


number = int(input("Please, ser the Number = "))
PowerOfTwo(number, 1)