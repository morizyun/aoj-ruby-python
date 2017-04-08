import math

def length(xa, ya, xb, yb):
  return math.sqrt((xa - xb)**2 + (ya - yb)**2)

n = int(raw_input())
for s in range(0, n):
  xa, ya, ra, xb, yb, rb = map(float, raw_input().split(' '))
  d = length(xa, ya, xb, yb)

  if ra > rb + d:
    print 2
  elif rb > ra + d:
    print -2
  elif d > ra + rb:
    print 0
  else:
    print 1