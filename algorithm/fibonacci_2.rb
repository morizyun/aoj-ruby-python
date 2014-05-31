n = 10

fb = [0, 1]

2.upto(n) do |i|
  fb[i] = fb[i-1] + fb[i-2]
end

puts fb.join(', ')

