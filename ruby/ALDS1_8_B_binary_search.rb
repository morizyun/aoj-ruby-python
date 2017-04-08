# 二分木探査
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_B&lang=jp

def binary_search(arr, a)
  return false if arr.size <= 1 && arr.last != a
  mid = (arr.size/2).floor
  n = arr[mid]

  if a == n
    return true
  elsif a > n
    binary_search(arr[mid..-1], a)
  else
    binary_search(arr[0..mid-1], a)
  end
end

loop do
  n = gets.to_i
  break if n == 0

  arr = gets.split(' ').map(&:to_i).sort
  _q = gets.to_i
  q_arr = gets.split(' ').map(&:to_i)

  count = 0
  q_arr.each do |a|
    count += 1 if binary_search(arr, a)
  end
  puts count
end
