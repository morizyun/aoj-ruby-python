n = 1000000

# エラトステネスの篩
# 指定された整数以下の全ての素数を発見するための単純なアルゴリズム
ns = (n**0.5).to_i + 1
is_prime = [false, false] + [true]*(n-1)
2.upto(ns) do |i|
  next if !is_prime[i]
  (i*i).step(n, i) do |j|
    is_prime[j] = false
  end
end

count = 0
list = (0..n).map do |i|
  count += 1 if is_prime[i]
  count
end

while gets
  puts list[$_.to_i]
end
