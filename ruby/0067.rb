def invalid_xy?(x, y)
  (x < 0 or x > 11 or y < 0 or y > 11)
end

def remove_island(x, y)
  [[1, 0], [-1, 0], [0, 1], [0, -1]].each do |dx, dy|
    next if invalid_xy?(x + dx, y + dy)
    if @map[y + dy][x + dx] == 1
      @map[y + dy][x + dx] = 0
      remove_island(x + dx, y + dy)
    end
  end
end

loop do
  @map = []
  while s = gets do
    tmp = s.chomp.split('').map(&:to_i)
    break unless tmp.count > 0
    @map << tmp
  end
  break unless @map.size == 12

  count = 0
  0.upto(11) do |x|
    0.upto(11) do |y|
      if @map[y][x] == 1
        count += 1
        remove_island(x, y)
      end
    end
  end
  puts count
end
