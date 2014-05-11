def judge(a,b,c)
  if a == b && b == c && a != 's'
    return a
  else
    return nil
  end
end

while gets
  s = $_.chomp.chars
  res = nil
  0.upto(3) do |i|
    res = judge(s[i], s[i+3], s[i+6])
    break if res
    res = judge(s[3*i], s[3*i+1], s[3*i+2])
    break if res
  end
  if s[4] != 's' and (judge(s[0], s[4], s[8]) or judge(s[2], s[4], s[6]))
    puts s[4]
  elsif res.nil?
    puts 'd'
  else
    puts res
  end
end

