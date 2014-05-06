n = input()
arr = map(int, raw_input().split())
answer = arr[n-1]

dp = [[0]*21 for i in range(n)]
dp[0][arr[0]] = 1

for i in range(1, n-1):
  for j in range(21):
    if dp[i-1][j] == 0: continue
    vp = j + arr[i]
    vm = j - arr[i]

    if vp <= 20:
      dp[i][vp] += dp[i-1][j]
    if vm >= 0:
      dp[i][vm] += dp[i-1][j]

print dp[n-2][answer]