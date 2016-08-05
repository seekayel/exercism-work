module BookKeeping
  VERSION=4
end

class Complement
  T = {"C":"G","G":"C","T":"A","A":"U"}
  def self.of_dna(seq)
    #print "seq[#{seq}]=>[#{T[seq.to_sym]}] T[#{T}]\n"
    out = seq.chars.map{|v| T[v.to_sym]}.join("")
    out = '' if out.length != seq.length
    out
  end
end
