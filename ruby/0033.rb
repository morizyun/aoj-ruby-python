n = gets.to_i

n.times do
  arr = gets.split(' ').map(&:to_i)

  left, right = [], []
  arr.each do |i|
    if (left.last || 0) < i
      left << i
    elsif (right.last || 0) < i
      right << i
    end
  end
  puts (left.size + right.size) == arr.size ? 'YES' : 'NO'
end
