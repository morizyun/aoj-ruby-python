#x = [1819, 2003, 876, 2840, 1723, 1673, 3776, 2848, 1592, 922]

from sys import stdin

x = [int(input()) for i in range(10)]

x.sort(reverse=True)

for i in x[:3]: print(i)
