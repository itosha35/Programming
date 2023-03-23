from random import randint


def getrandMas(n):
    return [randint(1, n) for _ in range(n)]


def checkUnique(mas):
    s = set(mas)
    return s


def main():
    mas = getrandMas(10)
    print(mas)
    #print(checkUnique(mas))   
    n = int(input("Set number to check = "))
    print(f'{n} meets in array {mas.count(n)} times')


if __name__ == '__main__':
    main()
