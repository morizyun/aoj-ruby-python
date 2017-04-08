# Merge Sort のアルゴリズム
#
# 1. 未整列のデータ群を半分に分ける操作を繰り返す
# 2. データ群が分割できなくなったところで今度は分割データのマージを繰り返す
# 3. マージはデータが整列するよう行う

class Array
  def merge_sort
    tmp = self.dup
    return tmp if tmp.length <= 1
    a, b = self.half.map(&:merge_sort)
    merge(a, b)
  end

  def half
    mid = length/2
    return slice(0...mid), slice(mid..-1)
  end

  def merge(a, b)
    res = []
    until a.empty? && b.empty?
      res <<
          case
            when a.empty? then b.shift
            when b.empty? then a.shift
            when a.first < b.first then a.shift
            else b.shift
          end
    end
    res
  end
end

_n = gets.to_i
puts gets.chomp.split(' ').map(&:to_i).merge_sort.join(' ')
