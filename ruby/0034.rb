def sum(arr)
  arr.inject(:+)
end

while str = gets
  arr = str.split(',').map(&:to_f)
  l_list, v_list = arr[0..9], arr[10..11]

  l1 = sum(l_list) * v_list[0] / sum(v_list)

  sum = 0
  l_list.each_with_index do |l, idx|
    sum += l
    if l1 <= sum
      puts idx + 1
      break
    end
  end
end
