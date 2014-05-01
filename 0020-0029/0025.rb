while gets do
  ar = $_.split(' ').map(&:to_i)
  br = gets.split(' ').map(&:to_i)
  hit = ar.map.with_index { |a, i| a == br[i] ? 1 : 0 }.inject(&:+)
  brow = (ar&br).size - hit
  puts "#{hit} #{brow}"
end