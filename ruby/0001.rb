arr = (1..10).map { gets.to_i }
puts arr.sort.reverse[0..2].join("\n")
