while s = gets do
  cards = s.split(',').map(&:to_i)
  card_count = Array.new(13){0}
  cards.each { |c| card_count[c-1] += 1 }
  str = card_count.join
  card_count.delete(0)

  scr = 'null'
  case card_count.sort
    when [1,4]
      scr = 'four card'
    when [2,3]
      scr = 'full house'
    when [1,1,1,1,1]
      scr = 'straight' if str =~ /1{5}/ or str =~ /10{8}1{4}/
    when [1,1,3]
      scr = 'three card'
    when [1,2,2]
      scr = 'two pair'
    when [1,1,1,2]
      scr = 'one pair'
  end
  puts scr
end