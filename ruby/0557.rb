n = gets.to_i
arr = gets.split(' ').map(&:to_i)
answer = arr[n-1]

dp = n.times.map { [0]*21 }
dp[0][arr[0]] = 1
1.upto(n-2) do |i|
  0.upto(20) do |j|
    next if dp[i-1][j] <= 0
    cp = j + arr[i]
    cm = j - arr[i]

    dp[i][cp] += dp[i-1][j] if cp <= 20
    dp[i][cm] += dp[i-1][j] if cm >= 0
  end
end

puts dp[n-2][answer]
