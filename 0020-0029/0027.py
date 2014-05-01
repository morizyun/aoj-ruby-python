import datetime, sys

wday_lst = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']

for s in sys.stdin:
  m,d = map(int, s.split())
  if m == 0 or d == 0: break
  str = '2004-%d-%d 00:00:00'%(m,d)
  day = datetime.datetime.strptime(str, '%Y-%m-%d %H:%M:%S')
  print wday_lst[day.weekday()]
