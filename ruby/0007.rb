n = gets.to_i

price = 100_000

n.times do
  price *= 1.05
  price = (price/1000.0).ceil * 1000
end

puts price
