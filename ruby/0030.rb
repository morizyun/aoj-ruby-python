def count(n, s, i, arr)
  if arr.size == n
    return s == arr.inject(:+) ? 1 : 0
  end

  ans = 0
  i.upto(9) do |j|
    arr.push(j)
    ans += count(n, s, j+1, arr)
    arr.pop
  end
  return ans
end

while gets
  n,s = $_.split(' ').map(&:to_i)
  break if n == 0 && s == 0
  puts count(n, s, 0, [])
end