# 04.76 s
class Array
  def quick_sort
    return self if length <= 1
    base = pop
    smaller, bigger = partition { |e| e < base }
    push base
    smaller.quick_sort + [base] + bigger.quick_sort
  end
end

n = gets.to_i
arr = gets.split(' ').map(&:to_i)

puts arr.quick_sort.join(' ')