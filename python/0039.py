dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

while True:
  try:
    arr = list(raw_input())

    sum = 0
    for i in range(len(arr)):
      if i == (len(arr) - 1):
        sum += dict[arr[i]]
      else:
        a = dict[arr[i]]
        b = dict[arr[i+1]]
        if a >= b:
          sum += a
        else:
          sum -= a

    print sum
  except EOFError:
    break
