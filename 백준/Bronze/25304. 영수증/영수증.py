x = int(input()) #영수증 총액
n = int(input()) #구매 물건의 종류
d = []
s = []
total = 0

for i in range(n):
  a, b = input().split()
  d.append((int(a), int(b)))

for a, b in d:
  s.append(a*b)

for num in s:
  total += num

if total == x:
  print("Yes")
else :
  print("No")
