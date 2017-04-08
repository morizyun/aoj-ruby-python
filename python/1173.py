while True:
  s = raw_input()
  if s == '.': break

  ns = ''
  for c in s:
    if c in ['(', ')', '[', ']']:
      ns += c

  while True:
    tmp = ns
    ns = ns.replace('[]', '')
    ns = ns.replace('()', '')
    if (tmp == ns): break

  print 'no' if ns else 'yes'