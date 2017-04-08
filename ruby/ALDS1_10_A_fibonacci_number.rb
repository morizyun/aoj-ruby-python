# フィボナッチ数列
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_10_A

max = 44
fib = [1, 1]
2.upto(max) do |i|
  fib[i] = fib[i-1] + fib[i-2]
end

while n = gets.to_i
  break if n == 0
  puts fib[n]
end
