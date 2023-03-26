def powerN(n, power):
    if power == 1:
        return n
    else:
        return n*powerN(n, power - 1)


def main():
    print(powerN(int(input("Set the Number = ")), int(input("Set the Power = "))))


if __name__ == "__main__":
    main()
