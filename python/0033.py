n = int(raw_input())
for i in range(n):
  left, right = [], []
  arr = map(int, raw_input().split(' '))
  for a in arr:
    if len(left) == 0 or left[len(left)-1] < a:
      left.append(a)
    elif len(right) == 0 or right[len(right)-1] < a:
      right.append(a)
    else:
      break

  if len(arr) == len(left) + len(right):
    print 'YES'
  else:
    print 'NO'