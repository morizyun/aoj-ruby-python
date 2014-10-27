a_can = (1..26).select{|i| 26.gcd(i) == 1}
cl = ('a'..'z').to_a

gets.to_i.times do
  s = gets.chomp
  hints = s.split(' ').select{|st| st.length==4}

  @alph = a_can.find do |a|
    @beta = (0..26).find do |b|
      %w(this that).any?{|h|
        hints.include?(h.chars.map{|i| cl[(a*cl.index(i)+b)%26]}.join)
      }
    end
  end

  map = (0..25).map{|i| (@alph*i+@beta)%26}
  puts s.chars.map{|i| cl.include?(i) ? cl[map.index(cl.index(i))] : i }.join
end