import sys

for s in sys.stdin:
  a, b, c, d, e, f = map(float, s.split())
  y = (a*f - d*c)/(a*e - d*b)
  x = (c - b*y)/a
  print '%.03f %.03f'%(x, y)