text = ['a', 'a', 'a', 'b', 'c', 'a', 'a', 'd', 'c', 'd', 'd']
    
print(text)
for i in range(len(text))[::-1]:
    count = text[:i].count(text[i])
    
    if count > 0:
        text[i] = text[i] + '_' + str(count)
        
print(text)
