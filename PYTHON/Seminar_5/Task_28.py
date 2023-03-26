def sumAB(a, b): # only +1 and -1 is used within function
    if a != 0:
        return 1 + sumAB(a-1, b)
    if b != 0:
        return 1 + sumAB(a, b-1)
    else:
        return 0


def main():
    print(sumAB(int(input('A = ')), int(input('B = '))))


if __name__ == "__main__":
    main()
