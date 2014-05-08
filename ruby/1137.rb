DICT = { 'm' => 1000, 'c' => 100, 'x' => 10, 'i' => 1 }.freeze

def mcxi_to_digit(s)
  sum = 0
  DICT.each do |k, v|
    if s.include?(k)
      if s[s.index(k)-1] >= '2' and s[s.index(k)-1] <= '9'
        sum += s[s.index(k)-1].to_i * v
      else
        sum += v
      end
    end
  end
  return sum
end

def digit_to_mcxi(n)
  str = ''
  DICT.to_a.map do |k, v|
    val = n/v
    n = n%v
    if val >= 2
      str += "#{val}#{k}"
    elsif val == 1
      str += k
    end
  end
  return str
end

n = gets.to_i
n.times do
  a, b = gets.chomp.split(' ')
  sum = mcxi_to_digit(a) + mcxi_to_digit(b)
  puts digit_to_mcxi(sum)
end