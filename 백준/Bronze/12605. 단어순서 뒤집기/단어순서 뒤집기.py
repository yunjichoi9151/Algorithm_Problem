n = int(input())
for i in range(1, n + 1):
  arr = list(input().rstrip().split())
  print('Case #%d: %s' %(i, ' '.join(arr[::-1])))