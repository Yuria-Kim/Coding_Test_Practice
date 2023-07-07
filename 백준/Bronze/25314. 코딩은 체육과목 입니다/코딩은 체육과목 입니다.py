n = int(input())
p = ""

for j in range(1, n+1):
  if j%4==0:
    p += "long "

print("{}{}".format(p,"int"))