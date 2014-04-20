# # 組み込み関数gcd, lcmを拡張する場合
# class Array
#   # 最大公約数: ２つ以上の正の整数に共通な約数（公約数）のうち最大のもの
#   def gcd
#     self.inject{|a,b| a.gcd(b)}
#   end
#
#   # 最小公倍数: ２つ以上の正の整数の共通な倍数（公倍数）のうち最小のもの
#   def lcm
#     self.inject{|a,b| a.lcm(b)}
#   end
# end

class Array
  # 最大公約数: ２つ以上の正の整数に共通な約数（公約数）のうち最大のもの
  def lcm
    self.inject do |a, b|
      a*b/self.gcd
    end
  end

  # 最小公倍数: ２つ以上の正の整数の共通な倍数（公倍数）のうち最小のもの
  # ユークリッドの互除法
  def gcd
    self.inject do |a, b|
      while b > 0
        a, b = b, a if a < b
        a, b = b, a%b
      end
      return a
    end
  end
end

while str = gets
  a = str.split(' ').map(&:to_i)
  puts "#{a.gcd} #{a.lcm}"
end