while gets
  n = $_.to_i
  n2 = n.to_s(2)
  arr = n2.reverse.split('').map.with_index { |s, i| s.to_i == 1 ? 2**i : 0 }
  puts arr.select{ |i| i > 0 }.join(' ')
end