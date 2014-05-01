def count(target, max_size, c_size, c_num, sum):
  if max_size == c_size:
    return 1 if sum == target else 0

  ans = 0
  for i in range(c_num, 10):
    ans += count(target, max_size, c_size+1, i+1, sum+i)
  return ans

import sys
for s in sys.stdin:
  max_size, target = map(int, s.split())
  if target == 0 and max_size == 0: break
  ans = count(target, max_size, 0, 0, 0)
  print ans