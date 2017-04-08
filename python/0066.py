def judge(a, b, c):
  return a if a == b == c and a != 's' else 0

while True:
  try:
    s = raw_input()
    for i in range(3):
      result = judge(*s[i:9:3])
      if result: break
      result = judge(*s[3*i:3*i+3])
      if result: break
    else:
      result = s[4] if s[4] != 's' and (judge(*s[0:9:4]) or judge(*s[2:7:2])) else 'd'
  except:
    break
  print result
