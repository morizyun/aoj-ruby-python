n = 1_000_000

is_prime = [false]*2 + [true]*(n-2)

max_n = Math.sqrt(n).floor + 1
2.upto(max_n) do |i|
  next unless is_prime[i]
  (i*i).step(by: i, to: n) do |j|
    is_prime[j] = false
  end
end

prime_count = []
count = 0
1.upto(n) do |i|
  count += 1 if is_prime[i]
  prime_count[i] = count
end

while n = gets.to_i
  break if n == 0
  puts prime_count[n]
end
