while str = gets
  until str =~ /the|this|that/
    str.tr!('a-z', 'b-za')
  end
  puts str
end
