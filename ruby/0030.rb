def element_count(element, start, sum, target)
  result = []
  start.upto(9) do |i|
    if element == 1
      tmp = (i + sum) == target ? true : false
      result << tmp
    else
      result += element_count(element - 1, i + 1, sum + i, target)
    end
  end
  result
end

while str = gets
  n, s = str.split(' ').map(&:to_i)
  break if n == 0 && s == 0
  result = element_count(n, 0, 0, s)
  puts result.select { |el| el }.count
end

