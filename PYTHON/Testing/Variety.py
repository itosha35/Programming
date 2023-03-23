import itertools


print(eval("1+2+3"))

list_1 = []
list_2 = list()
list_1 = [1, 2, 3, 4, 5]

print(list_1)
print(*list_1)

for i in list_1:
    print(i)
#add
list_1.append(8)
print(list_1)
#delete
list_1.pop(1)
print(list_1)
#insert
list_1.insert(1, 88)
print(list_1)

dict1 = dict()
dict1['left'] = 1
print(dict1)
dict2 = {'right':3}
print(type(dict2))
for i in dict1:
    print(i)
for i in dict1:
    print('{} : {}'.format(i, dict1[i]))

dict1 = {}
list1 = []
tup1 = ()
set1 = set()
print(type(dict1))
print(type(list1))
print(type(tup1))
print(type(set1))

list_1 = [i for i in range(1,11)]
print(list_1)

list_1 = [i for i in range(1,11) if i % 2 == 0]
print(list_1)

#char.isdigit()
s="1 2 3 4"
s = [str(s) for s in str.split(s) if s.isdigit()]
print(s)
# print(n)
# A = [0] * n
# for i in range(n):
#    A[i] = [0] * len(mas)
# print(A)
horses = [1, 2, 3, 4]
races = itertools.permutations(horses)
print(races)
print(list(itertools.permutations(horses)))