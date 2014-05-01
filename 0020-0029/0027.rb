require 'date'

wday_lst = %w(Sunday Monday Tuesday Wednesday Thursday Friday Saturday)

while gets
  m,d = $_.split(' ').map(&:to_i)
  break if m == 0 || d == 0
  day = Date::new(2004, m, d)
  puts wday_lst[day.wday]
end