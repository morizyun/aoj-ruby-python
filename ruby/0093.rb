def get_leap_years(from, to)
  res = []
  from.upto(to) do |i|
    if i%400 == 0
      res << i
    elsif i%100 == 0
      next
    elsif i%4 == 0
      res << i
    end
  end
  res
end

is_first_line = true
while gets do
  a, b = $_.split(' ').map(&:to_i)
  break if a == 0 && b == 0

  if is_first_line
    is_first_line = false
  else
    puts ''
  end

  res = get_leap_years(a, b)
  if res.count == 0
    puts 'NA'
  else
    puts res
  end
end