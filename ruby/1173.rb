def check_block(str)
  q = []
  str.gsub(/[^()\[\]]/, '').chars.each do |c|
    if c == '(' or c == '['
      q.push(c)
    elsif c == ')'
      r = q.pop() rescue nil
      return 'no' if r != '('
    elsif c == ']'
      r = q.pop() rescue nil
      return 'no' if r != '['
    end
  end
  q.count == 0 ? 'yes' : 'no'
end

while gets
  break if $_.chomp == '.'
  puts check_block($_.chomp)
end