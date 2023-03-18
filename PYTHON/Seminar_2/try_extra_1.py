import math

#mas = [8, 87, 7, 1, 11]
#mas = [9501, 2, 19, 98, 9, 11, 20, 100, 9278, 1234, 0, 1, 21, 1, 1, 1]
mas = [210, 1234, 0, 1, 21, 18, 9, 91]
#mas = [61,228,10,0]
#mas.sort(reverse=True)
print(mas)
cmas = []
n = int(math.log10(max(mas)))
for i in mas:
    if i != 0:
        if int(math.log10(i)) < n:
            i = i * int(math.pow(10, (n - int(math.log10(i)))))+ \
                (int(math.pow(10, (n - int(math.log10(i))))))-1
    cmas.append(i)
print(cmas)
num = ''
for i in range(len(cmas)):
    k = cmas.index(max(cmas))
    num = num + str(mas[k])+' '
    cmas[k] = -1
#print(cmas)
print(num)
