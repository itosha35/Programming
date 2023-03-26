from random import randint


def genMas(size, min, max):
    return [randint(min, max) for _ in range(size)]


def Intersection(list1, list2):
    inter = list(set(list1) & set(list2)) # set is to have unique numbers
    inter.sort() # sorting
    return inter


def main():
    m1 = genMas(int(input("Set Size = ")), int(
        input('Set MIN = ')), int(input('Set MAX = ')))
    print(f'List of Elements №1 = {m1}')
    m2 = genMas(int(input("Set Size = ")), int(
        input('Set MIN = ')), int(input('Set MAX = ')))
    print(f'List of Elements №2 = {m2}')
    print(f'Set of Unique numbers in both arrays (sorted) = {Intersection(m1,m2)}')


if __name__ == "__main__":
    main()
