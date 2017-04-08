while n = gets.to_f
  break if n <= 0
  sum = 0
  n.step(600 - n, n) do |j|
    sum += j * j * n
  end
  puts sum.to_i
end
