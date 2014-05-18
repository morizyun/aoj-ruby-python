# フィボナッチの勉強
# http://qnighy.hatenablog.com/entry/20090120/1232446370

require 'matrix'

# o(1.68^n) => 1.68^n乗回計算しないといけない
def fib_recursive(n)
  case n
    when 0, 1
      return 1
    else
      return fib_recursive(n-1) + fib_recursive(n-2)
  end
end

[25,30,35].each do |n|
  start = Time.now
  f = fib_recursive(n)
  time = Time.now - start
  puts "fib_recursive(#{n}) #{time} secs"
end
# fib_recursive(25) 0.012108 secs
# fib_recursive(30) 0.13573 secs
# fib_recursive(35) 1.484679 secs

# o(n) => n回計算しないといけない
def fib_liner(n)
  a, b = 0, 1
  n.times do
    a, b = b, a+b
  end
  return a
end

[100000, 200000, 300000].each do |n|
  start = Time.now
  f = fib_liner(n)
  time = Time.now - start
  puts "fib_liner(#{n}) #{time} secs"
end
# fib_liner(100000) 0.181897 secs
# fib_liner(200000) 0.581004 secs
# fib_liner(300000) 1.254803 secs

# o(log(n))
def fib_log(n)
  (Matrix[[1,1],[1,0]]**n)[0,1]
end

[1000000, 2000000, 3000000].each do |n|
  start = Time.now
  f = fib_log(n)
  time = Time.now - start
  puts "fib_log(#{n}) #{time} secs"
end
# fib_log(1000000) 0.178437 secs
# fib_log(2000000) 0.506755 secs
# fib_log(3000000) 1.010566 secs
