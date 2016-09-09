import string

def is_pangram(sentence=""):
  s = str(sentence)
  sen = list(set(s.lower()))
  f = [c for c in sen if c in string.ascii_lowercase]
  return len(f) == 26
