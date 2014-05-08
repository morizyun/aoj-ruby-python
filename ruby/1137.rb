n = gets.to_i
n.times do
  p = 1
  sum = 0
  str = gets.chomp.gsub(/\s/, '')
  str.chars do |c|
    if c == 'm'
      sum += p*1000
      p = 1
    elsif c == 'c'
      sum += p*100
      p = 1
    elsif c == 'x'
      sum += p*10
      p = 1
    elsif c == 'i'
      sum += p
      p = 1
    else
      p = c.to_i
    end
  end

  txt = ''
  h = { 1000 => 'm', 100 => 'c', 10 => 'x', 1 => 'i' }
  h.each do |k, v|
    begin
      i = (sum.to_i/k.to_i).ceil
      if i == 0
        next
      else
        txt += i >= 2 ? "#{i}#{v}" : v
        sum -= i*k.to_i
      end
    end
  end
  puts txt
end