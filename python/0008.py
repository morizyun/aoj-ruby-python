import sys

x = [0]*51
for i in range(0, 10):
  for j in range(0, 10):
    for k in range(0, 10):
      for l in range(0, 10):
        x[i+j+k+l] += 1

for s in sys.stdin:
  print x[int(s)]
