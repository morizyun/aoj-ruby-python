n = gets.to_i
n.times do
  sum = gets.to_i + gets.to_i
  puts sum.to_s.length >= 81 ? 'overflow' : sum
end