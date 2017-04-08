while gets do
  c1, c2, c3 = $_.chomp.split(' ').map(&:to_i)
  rem = (1..10).to_a - [c1, c2, c3]
  per = rem.map{ |i| c1 + c2 + i <= 20 ? 1 : 0 }.inject(:+)/7.0
  puts per >= 0.5 ? 'YES' : 'NO'
end