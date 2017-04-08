count_list = Array.new(2, 0)
while str = gets
  a, b, c = str.split(',').map(&:to_i)
  break if a == 0 || b == 0 || c == 0

  if c**2 == (a**2 + b**2)
    count_list[0] += 1
  elsif a == b
    count_list[1] += 1
  end
end

puts count_list
