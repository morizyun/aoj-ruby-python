while f = gets.to_f
  break if f == 0.0
  y = (f * f)/19.6

  puts ((y + 5) / 5 + 1).floor
end
