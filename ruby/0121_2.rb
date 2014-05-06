def swap(str, a, b)
  tmp = str.dup
  tmp[a], tmp[b] = tmp[b], tmp[a]
  return tmp
end

def breadth_first_search(answers, queue, move_list)
  loop do
    move_num, search = queue.shift
    break unless search

    a = search.index('0')
    move_list[a].each do |b|
      next_str = swap(search, a, b)
      next if answers[next_str]
      answers[next_str] = move_num + 1
      queue.push([move_num + 1, next_str])
    end
  end
  return answers
end

move_list = [[1, 4], [0, 2, 5], [1, 3, 6], [2, 7], [0, 5], [1, 4, 6], [2, 5, 7], [3, 6]].freeze
goal = '01234567'
answers = {goal => 0}
queue = [[0, goal]]
answers = breadth_first_search(answers, queue, move_list)

while gets
  s = $_.chomp.gsub(' ', '')
  puts answers[s]
end

