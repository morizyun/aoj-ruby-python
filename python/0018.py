import sys

for s in sys.stdin:
  arr = map(int, s.split(' '))
  arr = sorted(arr, reverse=True)
  arr = map(str, arr)
  print " ".join(arr)