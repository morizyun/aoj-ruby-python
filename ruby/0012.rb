require 'pry'

def area(x1, y1, x2, y2, x3, y3)
  a = Math.sqrt((x1 - x2)**2 + (y1 - y2)**2)
  b = Math.sqrt((x2 - x3)**2 + (y2 - y3)**2)
  c = Math.sqrt((x3 - x1)**2 + (y3 - y1)**2)
  s = (a + b + c)/2.0
  Math.sqrt(s*(s - a)*(s - b)*(s - c))
end

binding.pry

while gets do
  x1, y1, x2, y2, x3, y3, xp, yp = $_.chomp.split(' ').map(&:to_f)
  s_all = area(x1, y1, x2, y2, x3, y3)
  s_1 = area(x1, y1, x2, y2, xp, yp)
  s_2 = area(x2, y2, x3, y3, xp, yp)
  s_3 = area(x1, y1, x3, y3, xp, yp)
  puts (s_all - s_1 - s_2 - s_3).abs <= 0.00001 ? 'YES' : 'NO'
end
