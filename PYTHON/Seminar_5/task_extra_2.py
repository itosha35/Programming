def getNums(len: int, sum: int, k: int, s: int):
        if (len == k):
            if (sum == s):
                return 1 # +1
            else:
                return 0 # nothing          
        begin = int(len == 0) # to escape 0 in beginning only
        result = 0       
        for i in range(begin, 10): # digits form 0 (1) up to 9 (inclusive), not 10
            result += getNums(len + 1, sum + i, k, s) # sum == collected value for s comparison       
        return result
   

def main():
    k = int(input('Set K = '))
    s = int(input('Set S = '))
    print(f'Number of 10^{k}-nums == {s} : {getNums(0, 0, k, s)}')


if __name__ == "__main__":
    main()