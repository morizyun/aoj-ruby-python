while s = gets
  puts s.split(' ').map(&:to_i).sort.reverse.join(' ')
end