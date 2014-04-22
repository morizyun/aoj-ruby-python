w = int(raw_input())
n = int(raw_input())

arr = range(1, w+1)
for i in range(n):
  a, b = map(int, raw_input().split(','))
  arr[a-1], arr[b-1] = arr[b-1], arr[a-1]

for a in arr:
  print '%d'%a