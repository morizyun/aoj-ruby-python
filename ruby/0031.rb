while n = gets.to_i
  break if n == 0

  result = []
  str = n.to_s(2).reverse
  str.chars.each_with_index do |s, idx|
    result << 2**idx if s == '1'
  end

  puts result.map(&:to_s).join(' ')
end
