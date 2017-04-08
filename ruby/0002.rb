while str = gets
  puts str.split(' ').map(&:to_i).inject(:+).to_s.length
end
