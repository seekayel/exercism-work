module BookKeeping
  VERSION=2
end

class Pangram
  def self.is_pangram?(str)
    (('a'..'z').to_a - str.downcase.split('').uniq).length == 0
  end
end
