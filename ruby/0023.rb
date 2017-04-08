def length(xa, ya, xb, yb)
  Math.sqrt((xa - xb)**2 + (ya - yb)**2)
end

n = gets.to_i
while gets
  xa, ya, ra, xb, yb, rb = $_.split(' ').map(&:to_f)
  l = length(xa, ya, xb, yb)
  if ra > l + rb
    out = 2
  elsif rb > l + ra
    out = -2
  elsif ra + rb < l
    out = 0
  else
    out = 1
  end
  puts out
end