import sys

def kai(n):
  if(n <= 1):
    return 1
  else:
    return n*kai(n-1)

for n in sys.stdin:
  print kai(int(n))