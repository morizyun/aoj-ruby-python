import sys
import math

gx = gy = 0.0
th = 90.0
for s in sys.stdin:
  x, rot = map(int, s.split())
  gx += x*math.cos(th/180*math.pi)
  gy += x*math.sin(th/180*math.pi)
  th -= rot

print int(gx)
print int(gy)