steps = [1, 1, 2, 4]
(4..30).to_a.each do |i|
  steps[i] = steps[i-1] + steps[i-2] + steps[i-3]
end

while gets
  n = $_.to_i
  break if n == 0
  puts (steps[n]/3650.0).ceil
end