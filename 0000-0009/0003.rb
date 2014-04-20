n = gets.to_i

arr = []
n.times do
  arr << gets.split.map(&:to_i)
end

arr.each do |ia|
  ia.sort!
  if ((ia[0]**2 + ia[1]**2) == ia[2]**2)
    puts 'YES'
  else
    puts 'NO'
  end
end