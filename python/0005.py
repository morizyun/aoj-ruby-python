# coding:utf-8
import sys

# 最大公約数
def gcd(a, b):
  while b > 0:
    a, b = b, a%b
  return a

# 最小公倍数
def lcm(a, b):
  return a*b/gcd(a, b)

for s in sys.stdin:
  a, b = map(int,s.split())
  gcd_num = gcd(a, b)
  lcm_num = lcm(a, b)
  print "%d %d"%(gcd_num, lcm_num)

# output
# 2 24
# 10000000 150000000