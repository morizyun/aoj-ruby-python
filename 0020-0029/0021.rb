# Wrong Answerになるので一旦放置
def parallels?(x1, y1, x2, y2, x3, y3, x4, y4)
  a1 = (y2-y1)/(x2-x1) rescue Float::INFINITY
  a2 = (y4-y3)/(x4-x3) rescue Float::INFINITY
  return a1 == a2
end

n = gets.to_i
n.times do
  x1, y1, x2, y2, x3, y3, x4, y4 = gets.split(' ').map(&:to_f)
  if (y1==y2 && y3==y4) or parallels?(x1, y1, x2, y2, x3, y3, x4, y4)
    puts 'YES'
  else
    puts 'NO'
  end
end
