arr = []
while s = gets
  n = s.to_i
  if n == 0
    puts arr.pop
  else
    arr.push(n)
  end
end
