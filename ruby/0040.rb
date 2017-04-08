ALPHA = {}
('a'..'z').to_a.each_with_index { |c, idx| ALPHA[c] = idx }

def convert(char, a, b)
  i = (a * ALPHA[char] + b) % 26
  ALPHA[i]
end

def get_params(str)
  0..25.each do |i|
    0..25.each do |j|
      return i, j if str.chars.map { |s| convert(s, i, j) }.join('') =~ /this|that/
    end
  end
  return -1, -1
end

n = gets.to_i
n.times do
  arr = gets.chomp.split(' ')
  arr.select { |s| s.size == 4 }.each do |word|
    a, b = get_params(word)
    if a != -1 && b != -1
      puts
      break
    end
  end
end
