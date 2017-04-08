import sys

for s in sys.stdin:
  a,b = map(int,s.split())
  print len(str(a+b))