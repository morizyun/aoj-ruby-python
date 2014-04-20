while str = gets
  a, b, c, d, e, f = str.split(' ').map(&:to_f)
  y = (a*f-d*c)/(a*e-d*b)
  x = (c - b*y)/a
  puts sprintf('%.03f %.03f', x, y)
end

