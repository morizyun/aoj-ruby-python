arr = []
while gets
  arr += $_.chomp.scan(/[0-9]+/)
end
puts arr.map(&:to_i).inject(:+)