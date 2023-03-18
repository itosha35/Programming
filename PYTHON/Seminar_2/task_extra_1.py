import math

#mas = [501, 2, 1, 98, 9, 11, 20, 100, 9978, 1234]
mas = [61,228,10,0]
print(mas)
cmas = []
n = int(math.log10(max(mas)))
for i in mas:
    if i != 0:
        if int(math.log10(i)) < n:
            i = i * int(math.pow(10, (n - int(math.log10(i))))) + \
                int(math.pow(10, (n - int(math.log10(i)))))-1
    cmas.append(i)        
num = ''
for i in range(len(cmas)):
    k = cmas.index(max(cmas))
    num = num + str(mas[k])
    cmas[k] = -1    
print(num)