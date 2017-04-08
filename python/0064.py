import re

sum = 0
while True:
  try:
    str = raw_input()
    r = re.compile(r'[0-9]+')
    arr = r.findall(str)
    for a in arr:
      sum += int(a)
  except:
    break

print sum