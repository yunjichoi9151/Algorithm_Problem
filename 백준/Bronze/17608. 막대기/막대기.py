import sys
input = sys.stdin.readline
n = int(input())
stack = []
ans = 1
for i in range(n):
  stack.append(int(input()))
last=stack[-1]
for i in reversed(range(n - 1)):
  if stack[i] > last :
    last = stack[i]
    ans += 1
print(ans)