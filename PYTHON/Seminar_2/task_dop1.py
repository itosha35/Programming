import math

mas = [501, 2, 1, 99, 9, 11, 20, 100, 1234]
print(mas)
mas.sort(reverse=True)
print(mas)
n = int(math.log10(mas[0]))

d_list = list()
for j in range(n+1):
    s = ""
    for i in mas:
        if ((i < math.pow(10, j+1)) and (i >= math.pow(10, j))):
            s = s + ' ' + str(i)            
    s = s[1:]
    d_list.append(s)    
print(d_list)
ind = '0123456789'
parsenum = ''
#for i in d_list:
#    out = True
#    while (out):
#        if i[0]!='':

