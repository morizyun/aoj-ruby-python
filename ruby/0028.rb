a = Array.new(101, 0)

while n = gets.to_i
  break if n == 0
  a[n] += 1
end

max = a.max

a.each_with_index do |count, index|
  puts index if count == max
end