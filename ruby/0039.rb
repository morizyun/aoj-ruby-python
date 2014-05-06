c = {'I'=> 1, 'V'=> 5, 'X'=>10, 'L'=>50, 'C'=>100, 'D'=>500, 'M'=>1000}
while gets do
  arr = $_.chomp.chars

  sum = 0
  arr.size.times do |i|
    a = c[arr[i]]
    b = c[arr[i+1]]
    if b.nil?
      sum += a
    else
      sum = (a < b) ? sum-a : sum+a
    end
  end
  puts sum
end