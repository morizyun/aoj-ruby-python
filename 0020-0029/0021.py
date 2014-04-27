# Wrong Answerになるので一旦放置
n = int(input()) + 1
for val in range(1,n):
  x = map(float, raw_input().split(' '))
  if x[1]-x[3] == 0 and x[5]-x[7] == 0:
    print 'YES'
  elif x[1]-x[3] != 0 and x[5]-x[7] == 0:
    print 'NO'
  elif x[1]-x[3] == 0 and x[5]-x[7] != 0:
    print 'NO'
  else:
    if (x[0]-x[2])/(x[1]-x[3]) == (x[4]-x[6])/(x[5]-x[7]):
      print 'YES'
    else:
      print 'NO'