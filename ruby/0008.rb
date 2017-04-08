while n = gets.to_i
  break if n == 0

  count = 0
  0.upto(9) do |a|
    0.upto(9) do |b|
      0.upto(9) do |c|
        0.upto(9) do |d|
          if a + b + c + d == n
            count += 1
          end
        end
      end
    end
  end

  puts count
end
