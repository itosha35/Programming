def secondMax(max1: int, max2: int):
    n = int(input('next = '))
    if (n > 0):
        if (max1 <= n):
            secondMax(n, max1)
        elif (max2 <= n):
            secondMax(max1, n)
        else:
            secondMax(max1, max2)
    else:
        print(f'Second max = {max2}')


def main():
    secondMax(0, 0)


if __name__ == "__main__":
    main()
