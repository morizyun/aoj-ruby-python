w = gets.to_i
n = gets.to_i

arr = (1..w).to_a
n.times do
  a, b = gets.split(',').map(&:to_i)
  arr[a-1], arr[b-1] = arr[b-1], arr[a-1]
end
puts arr
