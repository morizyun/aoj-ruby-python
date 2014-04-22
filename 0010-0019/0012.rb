def c(x1, y1, x2, y2, x, y)
  (y2 - y1)*(x - x1) - (x2 - x1)*(y - y1)
end

# http://d.hatena.ne.jp/ymuto/20111226/1324890775
while s = gets
  x1, y1, x2, y2, x3, y3, xp, yp = s.split(/\s/).map(&:to_f)
  gx, gy = (x1 + x2 + x3)/3, (y1 + y2 + y3)/3

  r1 = c(x1, y1, x2, y2, gx, gy)*c(x1, y1, x2, y2, xp, yp) > 0
  r2 = c(x2, y2, x3, y3, gx, gy)*c(x2, y2, x3, y3, xp, yp) > 0
  r3 = c(x3, y3, x1, y1, gx, gy)*c(x3, y3, x1, y1, xp, yp) > 0
  puts (r1 && r2 && r3) ? 'YES' : 'NO'
end