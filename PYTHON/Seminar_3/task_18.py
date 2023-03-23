from random import randint


def getrandMas(n):
    return [randint(1, n) for _ in range(n)]


#def inMas(n, mas):
#   return bool(mas.count(n) > 0)


def closestNum(n, mas):
    mas2 = list((n - _)*(n - _) for _ in mas)  # not using math unit
    return mas[mas2.index(min(mas2))]


def main():
    mas = getrandMas(int(input("Please, set length of Array = ")))
    print(mas)
    print(closestNum(int(input('Please, set the number to compare = ')), mas))


if __name__ == '__main__':
    main()
