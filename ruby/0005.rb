# 最大公約数
def gcd(a, b)
  a, b = b, a if a > b
  until a == 0
    a, b = b%a, a
  end
  return b
end

# 最小公倍数
def lcm(a, b)
  a*b/gcd(a, b)
end

while gets do
  a, b = $_.chomp.split(' ').map(&:to_i)
  puts "#{gcd(a, b)} #{lcm(a, b)}"
end