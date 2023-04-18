def CheckRifma(s, vowels):
    s = s.lower()
    s = s.split()
    c = list()
    for i in s:
        counter = 0
        for a in i:
            if a in vowels: counter+=1
        c.append(counter)
    return max(c) == min(c)


def main():
    vow = "аеиоуюя"
    #ss = "пара-ра-рам рам-пам-папам па-ра-па-да"
    if CheckRifma(input("Введите фразу: "),vow): print("Парам пам-пам")
    else: print("Пам парам")

if __name__ == '__main__':
    main()
