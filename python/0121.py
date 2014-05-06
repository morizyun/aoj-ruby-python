MOVE = [[1, 4], [0, 2, 5], [1, 3, 6], [2, 7], [0, 5], [1, 4, 6], [2, 5, 7], [3, 6]]
answers = {"01234567": 0}

def swap(field, a, b):
  tmp = list(field)
  tmp[a], tmp[b] = tmp[b], tmp[a]
  return "".join(tmp)

def breadth_first_search(answers):
  q = [[0, "01234567"]]

  while len(q) != 0:
    g, field = q.pop(0)
    a = field.find("0")

    for b in MOVE[a]:
      tmp = swap(field, a, b)

      if not tmp in answers:
        answers[tmp] = g+1
        q.append([g+1, tmp])

  return answers

answers = breadth_first_search(answers)

while True:
  try:
    print answers[raw_input().replace(" ", "")]
  except:
    break