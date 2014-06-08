# ユークリッドの互除法 => 最大公約数
def gcd(a, b)
  a, b = b, a if a < b
  loop do
    break if b == 0
    a, b = b, a%b
  end
  return a
end

# 最小公倍数
# a*b/gcd(a, b)

while gets do
  a, b = $_.split(' ').map(&:to_i)
  gn = gcd(a, b)
  puts "#{gn} #{a*b/gn}"
end