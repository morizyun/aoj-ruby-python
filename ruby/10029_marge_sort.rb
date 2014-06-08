# 00.47 s
class Array
  def merge_sort
    tmp = self.dup
    return tmp if tmp.length <= 1
    a, b = self.half.map { |e| e.merge_sort }
    marge(a, b)
  end

  def half
    mid = length/2
    return slice(0...mid), slice(mid..-1)
  end

  def marge(a, b)
    res = []
    until a.empty? and b.empty?
      res <<
          case
            when a.empty? then b.shift
            when b.empty? then a.shift
            when a.first > b.first then b.shift
            else a.shift
          end
    end
    res
  end
end

n = gets.to_i
arr = gets.split(' ').map(&:to_i)

res = arr.merge_sort
puts res.join(' ')
