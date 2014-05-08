def mxciToDegit(s):
  dict = {'m': 1000, 'c': 100, 'x': 10, 'i': 1}
  sum = 0
  for c in dict:
    if c in s:
      if "2" <= s[s.index(c)-1] <= "9":
        sum += int(s[s.index(c)-1])*dict[c]
      else:
        sum += dict[c]
  return sum

n = int(raw_input())
for i in range(n):
  a, b = raw_input().split()
  sum = mxciToDegit(a) + mxciToDegit(b)

  st = ""
  list =((1000, "m"), (100, "c"), (10, "x"), (1, "i"))
  for d, c in list:
    val = sum/d
    if val >= 2:
      st += str(val) + c
    elif val == 1:
      st += c
    sum = sum%d
  print st