module BookKeeping
  VERSION = 3
end

class Hamming
  def self.compute(src,dest)
    raise ArgumentError if src.length != dest.length
    diff = 0
    src.chars.each_with_index{|v,i|
      diff += 1 if v != dest[i]
    }
    diff
  end
end
