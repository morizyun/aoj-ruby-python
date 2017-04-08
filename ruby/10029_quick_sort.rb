# Quick Sortのアルゴリズム
# 1. 未整列のデータ群から任意の１つを取り出す
# 2. これを基準に未整列のデータ群を大小２つに分ける
# 3. 分割したデータ群について1－2を繰り返す
# 4. データ群が分割できなくなったところで結果を連結する

class Array
  def quick_sort
    return self if length <= 1
    base = pop
    smaller, bigger = partition { |e| e < base }
    push base
    smaller.quick_sort + [base] + bigger.quick_sort
  end
end

_n = gets.to_i
puts gets.chomp.split(' ').map(&:to_i).quick_sort.join(' ')
