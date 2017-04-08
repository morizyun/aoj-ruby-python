def to_xy(str, target)
  str.chars.each_with_index do |s, i|
    if target == s.to_i
      x = i%4
      y = i < 4 ? 0 : 1
      return x, y, i
    end
  end
end

def move_zero(str, mx, my)
  zx, zy, zi = to_xy(str, 0)
  (1..7).each do |i|
    sx, sy, si = to_xy(str, i)
    if (zx + mx) == sx and (zy + my) == sy
      ns = str.dup
      ns[zi], ns[si] = ns[si], ns[zi]
      return ns
    end
  end
end

rule = Struct.new('Rule', :can_move?, :move)
rules = [
    rule.new(lambda { |str| x, _, _ = to_xy(str, 0); x <= 2 }, lambda { |str| move_zero(str,  1,  0) }),
    rule.new(lambda { |str| _, y, _ = to_xy(str, 0); y == 0 }, lambda { |str| move_zero(str,  0,  1) }),
    rule.new(lambda { |str| x, _, _ = to_xy(str, 0); x >= 1 }, lambda { |str| move_zero(str, -1,  0) }),
    rule.new(lambda { |str| _, y, _ = to_xy(str, 0); y == 1 }, lambda { |str| move_zero(str,  0, -1) })
]

goal = '01234567'
map_list = [goal]
answers = {goal => 0}
loop do
  search_map = map_list.shift
  break unless search_map
  rules.each do |rule|
    next unless rule.can_move?.call(search_map)
    next_map = rule.move.call(search_map)
    next if answers[next_map]
    answers[next_map.to_s] = answers[search_map] + 1
    map_list.push(next_map)
  end
end

while s = gets
  puts answers[s.chomp.split.join]
end