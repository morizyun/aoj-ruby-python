# reference site: http://melborne.github.io/2010/10/12/Ruby/

require 'benchmark'

class Array
  def quick_sort
    return self if length <= 1
    base = pop
    smaller, bigger = partition { |e| e < base }
    push base
    smaller.quick_sort + [base] + bigger.quick_sort
  end

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

##################################################
puts '0-100000の数字を100,000個、ランダムに並べる場合'

sample = (0..100000).sort_by { rand }

puts Benchmark::CAPTION
puts 'quick_sort: ' + Benchmark.measure { sample.quick_sort }.to_s
puts 'marge_sort: ' + Benchmark.measure { sample.merge_sort }.to_s
puts 'ruby_sort:  ' + Benchmark.measure { sample.sort }.to_s

# user     system      total        real
# quick_sort:   0.250000   0.000000   0.250000 (  0.253962)
# marge_sort:   0.340000   0.000000   0.340000 (  0.349896)
# ruby_sort:    0.020000   0.010000   0.030000 (  0.015256)

##################################################
puts '0-100の数字を100,000個、ランダムに並べる場合'

sample = (1..1000).map{ (0..100).sort_by { rand } }.flatten

puts Benchmark::CAPTION
puts 'quick_sort: ' + Benchmark.measure { sample.quick_sort }.to_s
puts 'marge_sort: ' + Benchmark.measure { sample.merge_sort }.to_s
puts 'ruby_sort:  ' + Benchmark.measure { sample.sort }.to_s

# user     system      total        real
# quick_sort:   4.490000   0.040000   4.530000 (  4.529826)
# marge_sort:   0.370000   0.010000   0.380000 (  0.371850)
# ruby_sort:    0.000000   0.000000   0.000000 (  0.006622)
