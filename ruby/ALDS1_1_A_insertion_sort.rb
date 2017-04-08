while n = gets.to_i
  break if n == 0
  arr = gets.split(' ').map(&:to_i)

  0.upto(arr.size - 1) do |i|
    v = arr[i]
    j = i - 1
    while j >= 0 && arr[j] > v
      arr[j+1] = arr[j]
      j -= 1
    end
    arr[j+1] = v
    puts arr.join(' ')
  end
end
