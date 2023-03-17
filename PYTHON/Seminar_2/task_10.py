from random import randint

def GetArray(amount):
    coin_list = dict()
    coin_list['Averse'] = 0
    coin_list['Reverse'] = 0
    for i in range(amount):
        if randint(0, 1) == 0:
            coin_list['Averse'] += 1
        else:
            coin_list['Reverse'] += 1
    return coin_list

coin_set = GetArray(int(input('Please, set amount of the coins = ')))
for i in coin_set:
    print('{} : {}'.format(i, coin_set[i]))
if coin_set['Averse'] > coin_set['Reverse']:
    print(f'You need to implement {coin_set["Reverse"]} actions')
elif coin_set['Averse'] < coin_set['Reverse']:
    print(f'You need to implement {coin_set["Averse"]} actions')
else:
    print(f'You need to implement {coin_set["Reverse"]} actions')
