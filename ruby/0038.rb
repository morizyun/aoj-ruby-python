while str = gets
  arr = str.split(',').map(&:to_i)
  cards = Array.new(13, 0)
  arr.each { |a| cards[a - 1] += 1 }

  result = if cards.max == 4
             'four card'
           elsif cards.max == 3 && cards.select { |i| i == 2 }.count == 1
             'full house'
           elsif cards.join('') =~ /(1{5}|10{8}1{4})/
             'straight'
           elsif cards.max == 3
             'three card'
           elsif cards.select { |i| i == 2 }.count == 2
             'two pair'
           elsif cards.select { |i| i == 2 }.count == 1
             'one pair'
           else
             'null'
           end
  puts result
end
