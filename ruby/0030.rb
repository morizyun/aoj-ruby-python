def get_prime_count(n)
  sqrt_num = Math.sqrt(n)
  is_prime = [false, false] + [true]*(n - 1)

  2.upto(sqrt_num) do |i|
    next unless is_prime[i]
    (i*i).step(n, i) do |j|
      is_prime[j] = false
    end
  end

  result = []
  count = 0
  0.upto(n) do |i|
    count += 1 if is_prime[i]
    result[i] = count
  end

  return result
end

n = 1000000
prime_count = get_prime_count(n)

while gets do
  n = $_.to_i
  puts prime_count[n]
end