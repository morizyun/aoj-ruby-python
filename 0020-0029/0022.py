while True:
  n = int(raw_input())
  if n == 0: break
  max_n = max_m = -100000
  r = 0

  for i in range(n):
    m = int(raw_input())
    max_n = max(max_n, m)
    r = max(r+m, 0)
    max_m = max(max_m, r)

  if max_n > 0:
    print max_m
  else:
    print max_n
