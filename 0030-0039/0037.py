import sys
for s in sys.stdin:
  hand = sorted(map(int, s.split(',')))
  kind = len(set(hand))
  ma = max([hand.count(i) for i in hand])

  ans = 'null'
  if kind == 4:
    ans = 'one pair'
  elif kind == 3:
    if ma == 2:
      ans = 'two pair'
    else:
      ans = 'three card'
  elif kind == 2:
    if ma==4:
      ans = 'four card'
    else:
      ans = 'full house'
  else:
    if hand == [1,10,11,12,13] or (hand[4] - hand[0]) == 4:
      ans = 'straight'
  print ans
