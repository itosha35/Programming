def ChockoPlateSplit(n, m, amount):
    if (amount == n) | (amount == m):
        return True
    elif (amount % n) == 0 & (amount // n) <= m:
        return True
    elif (amount % m) == 0 & (amount // m) <= n:
        return True
    else:
        return False

n = int(input("Set n = "))
m = int(input("Set m = "))
plate = int(input("Plate number = "))
if ChockoPlateSplit(n,m,plate):
    print(f'{plate} pices can be taken in one splin from {n} x {m} plate')
else: print(f'{plate} pices can NOT be taken in one splin from {n} x {m} plate')
