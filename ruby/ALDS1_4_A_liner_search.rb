# 線形探査
loop do
  n = gets.to_i
  break if n == 0

  arr = gets.split(' ').map(&:to_i)
  _q = gets.to_i
  q_arr = gets.split(' ').map(&:to_i)

  count = 0
  q_arr.each do |a|
    arr.each do |b|
      count += 1 if a == b
    end
  end
  puts count
end
