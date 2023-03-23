# В настольной игре Скрабл (Scrabble) каждая буква имеет определенную ценность.
# В случае с английским алфавитом очки распределяются так:
# A, E, I, O, U, L, N, S, T, R – 1 очко; D, G – 2 очка;
# B, C, M, P – 3 очка; F, H, V, W, Y – 4 очка;
# K – 5 очков; J, X – 8 очков; Q, Z – 10 очков.
# А русские буквы оцениваются так:
# А, В, Е, И, Н, О, Р, С, Т – 1 очко;
# Д, К, Л, М, П, У – 2 очка; Б, Г, Ё, Ь, Я – 3 очка;
# Й, Ы – 4 очка; Ж, З, Х, Ц, Ч – 5 очков;
# Ш, Э, Ю – 8 очков; Ф, Щ, Ъ – 10 очков.
# Напишите программу, которая вычисляет стоимость введенного пользователем слова.
# Будем считать, что на вход подается только одно слово, которое содержит либо только английские, либо только русские буквы.
def setValues():
    d = dict()
    s = 'A, E, I, O, U, L, N, S, T, R, А, В, Е, И, Н, О, Р, С, Т'.replace(
        ', ', '')
    d[s] = 1  # points
    s = 'D, G, Д, К, Л, М, П, У'.replace(', ', '')
    d[s] = 2  # points
    s = 'B, C, M, P, Б, Г, Ё, Ь, Я'.replace(', ', '')
    d[s] = 3  # points
    s = 'F, H, V, W, Y, Й, Ы'.replace(', ', '')
    d[s] = 4  # points
    d['KЖЗХЦЧ'] = 5  # points
    d['JXШЭЮ'] = 8  # points
    d['QZФЩЪ'] = 10  # points

    return d


def calcValue(word, valset):
    d = list(valset.keys())
    s = word.upper()
    value = 0
    for i in s:
        for j in d:
            if j.count(i) > 0:
                value += valset[j]
    return value


def main():
    print(calcValue(input("Please, print the word to assume = "), setValues()))


if __name__ == "__main__":
    main()
