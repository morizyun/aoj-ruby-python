def length(xa, ya, xb, yb)
  Math.sqrt((xa - xb)*(xa - xb) + (ya - yb)*(ya - yb))
end

n = gets.to_i
n.times do
  xa, ya, ra, xb, yb, rb = gets.split(' ').map(&:to_f)
  len = length(xa, ya, xb, yb)

  if ra > rb + len
    puts 2
  elsif rb > ra + len
    puts -2
  elsif ra + rb < len
    puts 0
  else
    puts 1
  end
end
