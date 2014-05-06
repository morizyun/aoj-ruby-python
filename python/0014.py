import sys
for d in map(int,sys.stdin):
  sum = 0
  for x in range(d, 600, d): sum += x**2
  print '%d'%(sum*d)