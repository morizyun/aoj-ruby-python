num = gets.to_i
num.times do
  left, right = [], []
  arr = gets.chomp.split(' ').map(&:to_i)
  arr.each do |a|
    if (left.last || 0) < a
      left << a
    elsif (right.last || 0) < a
      right << a
    else
      break
    end
  end
  puts (arr.size == (left.size + right.size)) ? 'YES' : 'NO'
end