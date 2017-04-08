# 動的計画法(DP)

loop do
  n = gets.to_i
  break if n == 0
  arr = gets.split(' ').map(&:to_i)

  dp = Array.new(n) { Array.new(21, 0) }

# スタート地点
  dp[0][arr[0]] = 1

  1.upto(n-2) do |i|
    0.upto(20) do |j|
      next if dp[i-1][j] == 0

      plus = j + arr[i]
      minus = j - arr[i]

      dp[i][plus] += dp[i-1][j] if plus <= 20
      dp[i][minus] += dp[i-1][j] if minus >= 0
    end
  end

  puts dp[n-2][arr[n-1]]
end
