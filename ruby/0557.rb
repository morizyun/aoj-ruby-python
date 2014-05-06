n = gets.to_i
arr = gets.split(' ').map(&:to_i)
answer = arr[n-1]

dp = Array.new(n).map { Array.new(21, 0) }
dp[0][arr[0]] = 1
1.upto(n-2) do |i|
  0.upto(20) do |j|
    next if dp[i-1][j] == 0
    vp = j + arr[i]
    vm = j - arr[i]

    dp[i][vp] += dp[i-1][j] if vp <= 20
    dp[i][vm] += dp[i-1][j] if vm >= 0
  end
end

puts dp[n-2][answer]