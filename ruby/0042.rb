@case_num = 1
while true do
  w = gets.to_i
  break if w == 0
  n = gets.to_i
  table = n.times.map{ gets.split(',').map(&:to_i) }

  mw, mv = w, 0
  dp = Array.new(n+1){Array.new}
  dp[0][0] = 0
  table.each.with_index(1) do |p, i|
    (0..w).reject{ |wi| dp[i-1][wi].nil? }.each do |wi|
      va = dp[i][wi] = [dp[i][wi]||0, dp[i-1][wi]].max
      mw, mv = wi, va if va > mv || (va==mv && wi < mw)
      if wi + p[1] <= w
        va = dp[i][wi+p[1]] = [dp[i][wi+p[1]]||0, dp[i-1][wi] + p[0]].max
        mw, mv = wi + p[1], va if va > mv || (va==mv && (wi + p[1])< mw)
      end
    end
  end
  puts "Case #{@case_num}:", mv, mw
  @case_num += 1
end