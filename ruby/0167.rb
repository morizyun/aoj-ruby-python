loop do
  n = gets.to_i
  break if n.zero?
  arr = n.times.map { gets.to_i }

  count = 0
  (n-2).downto(0) do |i|
    0.upto(i) do |j|
      if arr[j] > arr[j+1]
        arr[j], arr[j+1] = arr[j+1], arr[j]
        count += 1
      end
    end
  end
  puts count
end
