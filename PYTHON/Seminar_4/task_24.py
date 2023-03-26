from random import randint


def fillGarden(bushes, maxget):
    garden = [randint(0, maxget) for _ in range(bushes)]
    # extension due to Circullar garden shape
    # When last bush is engaged We can take first bush
    # 1 2 3 4 => 4_1 2 3 4_1 - now we can use simple linear search of tripples
    garden.append(garden[0])
    garden.insert(0, garden[bushes-1])
    return garden


def analyzeGarden(garden):
    gardenValue = [garden[i]+garden[i-1]+garden[i+1]
                   for i in range(1, len(garden)-1)]
    return gardenValue


def main():
    source = fillGarden(5, 5)
    print(f'Garden Sourse = {source[1:-1]}')
    goodval = analyzeGarden(source)
    print(f'Goods amount for all Garden variants = {goodval}')
    print(
        f'Max value of berries is = {max(goodval)}, taken from {goodval.index(max(goodval))+1} bush ')


if __name__ == "__main__":
    main()
