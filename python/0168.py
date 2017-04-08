import math

steps=[1, 1, 2, 4]+ [0]*27
for i in range(4, 31):
  steps[i] = steps[i-1] + steps[i-2] + steps[i-3]

while True:
  n = input()
  if n == 0: break
  print int(math.ceil(steps[n]/3650.0))