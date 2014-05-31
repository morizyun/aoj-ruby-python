n = 1000
sn = Math.sqrt(n).ceil
is_prime = [true] * (n + 1)

2.upto(sn) do |i|
  next unless is_prime[i]
  (i*i).step(n, i) do |j|
    is_prime[j] = false
  end
end

puts (1..n).to_a.select{ |i| is_prime[i] }.join(' ')