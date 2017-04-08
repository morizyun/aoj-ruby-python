c = { 'I' => 1, 'V' => 5, 'X' => 10, 'L' => 50, 'C' => 100, 'D' => 500, 'M' => 1000 }

while str = gets
  arr = str.chomp.chars
  break if arr.size == 0

  sum = 0
  0.upto(arr.size-1) do |i|
    a, b = arr[i], arr[i+1]

    if i == arr.size - 1
      sum += c[a]
    elsif c[a] < c[b]
      sum -= c[a]
    else
      sum += c[a]
    end
  end
  puts sum
end
