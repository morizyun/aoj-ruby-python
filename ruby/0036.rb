loop do
  s = (1..8).map { gets.chomp }.join
  puts case s
       when /110{6}11/ then 'A'
       when /10{7}10{7}10{7}1/ then 'B'
       when /1111/ then 'C'
       when /10{6}110{6}1/ then 'D'
       when /110{7}11/ then 'E'
       when /10{7}110{7}1/ then 'F'
       when /110{5}11/ then 'G'
       end
  break unless gets
end
