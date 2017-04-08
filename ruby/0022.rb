while n = gets.to_i
  break if n == 0

  max_sum = -100_000
  sum = 0
  n.times do
    m = gets.to_i
    sum += m
    max_sum = sum if sum > max_sum
    sum = 0 if sum < 0
  end

  puts max_sum
end
