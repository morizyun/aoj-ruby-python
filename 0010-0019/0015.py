n = int(input())
for i in range(n):
  sum = long(input()) + long(input())
  if len(str(sum)) >= 81:
    print 'overflow'
  else:
    print sum