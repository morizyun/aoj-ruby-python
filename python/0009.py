from bisect import bisect

n = 1000000
sn = int(n**0.5)+1

num = [False, False] + [True]*(n-1)
for i in xrange(2, int(n**0.5)+1):
  if num[i]:
    for j in xrange(i**2, n, i):
      num[j] = False
prime = [i for i in xrange(2, n) if num[i]]

while True:
  try:
    print bisect(prime, input())
  except:
    break
