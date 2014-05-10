while True:
  try:
    count = 0
    c1, c2, c3 = map(int, raw_input().split())
    for i in range(1, 11):
      if i in [c1, c2, c3]: continue
      if c1 + c2 + i <= 20: count += 1

    if count/7.0 >= 0.5:
      print 'YES'
    else:
      print 'NO'
  except:
    break