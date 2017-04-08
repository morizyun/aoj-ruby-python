# 幅優先探索

MOVE_LIST = [
    [1, 4],
    [0, 2, 5],
    [1, 3, 6],
    [2, 7],
    [0, 5],
    [1, 4, 6],
    [2, 5, 7],
    [3, 6]
]

goal = '01234567'
step_hash = { goal => 0 }
queue = [[goal, 0]]

def swap(str, a, b)
  tmp = str.dup
  tmp[a], tmp[b] = tmp[b], tmp[a]
  tmp
end

loop do
  figure, step_count = queue.shift
  break if figure.nil? || step_count.nil?

  current_idx = figure.index('0')
  MOVE_LIST[current_idx].each do |new_idx|
    new_figure = swap(figure, current_idx, new_idx)
    next if step_hash[new_figure]

    step_hash[new_figure] = step_count + 1
    queue << [new_figure, step_count + 1]
  end
end

loop do
  str = gets.to_s.split(' ').join('')
  break if str.length <= 0
  puts step_hash[str]
end
