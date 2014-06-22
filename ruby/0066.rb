def judge(a, b, c)
  (a == b) && (b == c) && a != 's'
end

while gets do
  a = $_.chomp.chars

  res = nil
  3.times do |i|
    if judge(a[3*i], a[3*i+1], a[3*i+2])
      res = a[3*i]
      break
    elsif judge(a[i], a[i+3], a[i+6])
      res = a[i]
      break
    end
  end

  if res
    puts res
  elsif judge(a[0], a[4], a[8]) or judge(a[2], a[4], a[6])
    puts a[4]
  else
    puts 'd'
  end
end