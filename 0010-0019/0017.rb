while s = gets
  until s =~ /that|the|this/
    s.tr!('a-z', 'b-za')
  end
  puts s
end