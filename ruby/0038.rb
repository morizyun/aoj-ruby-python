while gets do
  arr = $_.split(',').map(&:to_i)
  cards = [0]*13
  arr.each do |i|
    cards[i - 1] += 1
  end

  sc = cards.select{ |i| i >= 1 }.sort
  str = cards.join('')

  case sc
    when [1, 4]
      puts 'four card'
    when [2, 3]
      puts 'full house'
    when [1, 1, 3]
      puts 'three card'
    when [1, 2, 2]
      puts 'two pair'
    when [1, 1, 1, 2]
      puts 'one pair'
    when [1, 1, 1, 1, 1]
      if str =~ /1{5}|10{8}1{4}/
        puts 'straight'
      else
        puts 'null'
      end
    else
      puts 'null'
  end
end