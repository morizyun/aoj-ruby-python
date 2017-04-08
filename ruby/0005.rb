def kouyakusu(a, b)
  loop do
    rem = b % a
    return a if rem == 0
    a, b = rem, a
  end
end

def kobaisu(a, b)
  (a * b) / kouyakusu(a, b)
end

while str = gets
  a, b = str.split(' ').map(&:to_i).sort
  puts "#{kouyakusu(a, b)} #{kobaisu(a, b)}"
end
