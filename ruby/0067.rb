def remove_island(i, j, map)
  map[i][j] = '0'
  [[0, 1], [1, 0], [0, -1], [-1, 0]].each do |x, y|
    next if !(0..11).include?(i + x) || !(0..11).include?(j + y)
    if map[i + x][j + y]=='1'
      remove_island(i + x, j + y, map)
    end
  end
end

loop do
  map = 12.times.map{ gets.chomp }
  count = 0
  12.times do |i|
    12.times do |j|
      if map[i][j] == '1'
        count += 1
        remove_island(i, j, map)
      end
    end
  end
  puts count
  break if gets.nil?
end
