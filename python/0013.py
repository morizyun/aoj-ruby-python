import sys

stack = []
for n in sys.stdin:
  if int(n) == 0:
    print '%d'%int(stack.pop())
  else:
    stack.append(n)