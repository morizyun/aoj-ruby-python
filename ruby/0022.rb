loop do
  n = gets.to_i
  break if n==0
  max = max_n = -100000
  r = 0
  n.times do
    m = gets.to_i
    max_n = [max_n, m].max
    r = [r+m, 0].max
    max = [max, r].max
  end
  puts max_n > 0 ? max : max_n
end