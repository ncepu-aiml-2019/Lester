
def find_prime_number(h):
    k = 0
    if h == 1:
        return 0
    if h == 2:
        return 1
    for i in range(2, h):
        if h % i == 0:
            k += 1
        i += 1
    if k == 0:
        return 1
    else:
        return 0


h = int(input("请输入一个数字"))
count = 0
for i in range(1, h+1):
    p = find_prime_number(i)
    if p == 1:
        count += 1
print(count)








