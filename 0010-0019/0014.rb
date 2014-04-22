while gets do
  d = $_.to_i
  puts d.step(600, d).map { |x| (x-d)**2*d }.inject(:+)
end