import math

# mas = [8, 87, 7, 1, 11]
#mas = [9501, 2, 19, 98, 9, 11, 20, 100, 9278, 1234, 0, 1, 21, 1, 1, 1]
#mas = [210, 1234, 0, 1, 21, 18, 9, 91]
#mas = [61,228,10,0]
mas = [61,228,9]
num = ''
for i in range(len(mas)-1):
    for j in range(len(mas)-i-1):
        if int(str(mas[j])+str(mas[j+1])) < int(str(mas[j+1])+str(mas[j])):
            temp = mas[j]
            mas[j] = mas[j+1]
            mas[j+1] = temp
for i in mas:
    num += str(i)
print(num)