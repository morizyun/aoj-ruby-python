while gets do
  d = $_.to_f
  puts d.step(600 - d, d).map { |i| d*i*i }.inject(:+).to_i
end
