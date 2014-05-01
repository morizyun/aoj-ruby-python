import sys

for s in sys.stdin:
  nb = format(int(s), 'b')
  arr = list(reversed(nb))
  i = 0
  for a in arr:
    if a == '1':
      print str(2**i),
    i += 1
  print