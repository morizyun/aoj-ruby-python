while n = gets.to_i
  break if n == 0
  arr = gets.split(' ').map(&:to_i)

  count = 0
  0.upto(n-1) do |i|
    min_j = i
    i.upto(n-1) do |j|
      min_j = j if arr[min_j] > arr[j]
    end
    if min_j != i
      arr[i], arr[min_j] = arr[min_j], arr[i]
      count += 1
    end
  end
  puts arr.join(' ')
  puts count
end
