def get_map():
  map = []
  while True:
    try:
      tmp = list(raw_input())
      if len(tmp) != 12: break
      map.append(tmp)
    except:
      break
  return map

def remove_island(x, y, map):
  map[x][y] = 0
  move = [[1, 0], [0, 1], [-1, 0], [0, -1]]
  for i, j in move:
    if 0 <= x + i <= 11 and 0 <= y + j <= 11 and map[x + i][y + j] == '1':
      map = remove_island(x + i, y + j, map)
  return map[:]

while True:
  map = get_map()
  if len(map) != 12: break

  count = 0
  for x in range(12):
    for y in range(12):
      if map[x][y] == '1':
        count += 1
        map = remove_island(x, y, map)
  print count
