while n = gets.to_i do
  count = 0
  0.upto(9) do |a|
    next if a+27 < n
    0.upto(9) do |b|
      next if a+b+18 < n
      0.upto(9) do |c|
        next if a+b+c+9 < n
        0.upto(9) do |d|
          count += 1 if a+b+c+d == n
        end
      end
    end
  end
  puts count
end

