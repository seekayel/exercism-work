trans = {'G':'C', 'C':'G', 'T':'A', 'A':'U'}

def to_rna(input=""):
  return ''.join([trans[i] for i in input])
