def distance(s1, s2):
  if len(s1)==len(s2):
    cnt=0
    for n,m in zip(s1,s2):
      cnt+=1 if n!=m else 0
  
  return cnt
