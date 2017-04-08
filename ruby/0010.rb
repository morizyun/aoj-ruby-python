include Math

# http://www.h6.dion.ne.jp/~jpe02_tn/ki-5.html
def get_center(x1, y1, x2, y2, x3, y3)
  a1 = 2*(x2 - x1)
  b1 = 2*(y2 - y1)
  c1 = x1**2 - x2**2 + y1**2 - y2**2
  a2 = 2*(x3 - x1)
  b2 = 2*(y3 - y1)
  c2 = x1**2 - x3**2 + y1**2 - y3**2
  x = (b1*c2 - b2*c1)/(a1*b2 - a2*b1)
  y = (c1*a2 - c2*a1)/(a1*b2 - a2*b1)
  return x, y
end

def get_length(x1, y1, x2, y2, x3, y3)
  a = sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2))
  b = sqrt((x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3))
  c = sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1))
  return a, b, c
end

def get_radius(x1, y1, x2, y2, x3, y3)
  a, b, c = get_length(x1, y1, x2, y2, x3, y3)
  s = (a + b + c)/2.0
  area = sqrt(s*(s-a)*(s-b)*(s-c))
  (a*b*c)/(4.0*area)
end

n = gets.to_i
n.times do
  x1, y1, x2, y2, x3, y3 = gets.split(/\s/).map(&:to_f)
  r = get_radius(x1, y1, x2, y2, x3, y3)
  cx, cy = get_center(x1, y1, x2, y2, x3, y3)
  puts sprintf('%.3f %.3f %.3f', cx, cy ,r)
end