loop do
  s, t = gets.chomp, gets.chomp rescue break
  s, t = t, s if s.length > t.length
  max_l = (s.chars & t.chars).map do |a|
    [s.count(a), t.count(a)].min
  end.inject(:+).to_i

  answer = 0
  0.upto(t.length).each do |i|
    break if t.length - i <= answer
    max = [max_l+1, t.length - i + 1].min - 1
    (answer + 1).upto(max) do |j|
      if s.include?(t[i...i+j])
        answer = j
      else
        break
      end
    end
  end

  puts answer
end