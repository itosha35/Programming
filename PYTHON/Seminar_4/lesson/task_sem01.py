join_to_bug = lambda a: int(''.join(sorted(map(str,a), reverse= True)))

def ert(a,l):
    return(a(l))

if __name__ == '__main__':
    print(ert(join_to_bug, [61,228,10,0,12, 9, 8, 91]))