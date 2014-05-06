gx, gy = 0, 0
th = 90
while gets do
  st, rot = $_.split(',').map(&:to_i)
  break if st == 0 && rot == 0
  gx = gx + st*Math.cos(th/180.0*Math::PI)
  gy = gy + st*Math.sin(th/180.0*Math::PI)
  th -= rot
end
puts [gx.to_i, gy.to_i]