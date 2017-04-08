while str = gets
  a, b, c, d, e, f = str.split(' ').map(&:to_f)
  x = (b*f - e*c)/(b*d - e*a)
  y = (c - a*x)/b
  x = 0.0 if x.round(3) == -0.000
  y = 0.0 if y.round(3) == -0.000
  puts sprintf('%.3f %.3f', x.round(3), y.round(3))
end
