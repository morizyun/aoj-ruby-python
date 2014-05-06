n = gets.to_i
rent = 100000

n.times.each do
  rent = ((rent*1.05)/1000).ceil*1000
end

puts rent