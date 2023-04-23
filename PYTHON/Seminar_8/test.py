import os

#colors = ['blue blue', 'red red', 'white white', 'bla']

with open(r'data.txt', 'r+') as file:
    #s = ' '.join(colors)
    line = file.read()

print(line)