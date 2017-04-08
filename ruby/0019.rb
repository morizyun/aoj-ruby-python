def kai(n)
  return 1 if n <= 0
  n*kai(n-1)
end

while gets do
  n = $_.to_i
  puts kai(n)
end