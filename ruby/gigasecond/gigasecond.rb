module BookKeeping
  VERSION = 3
end
class Gigasecond
  def self.from(birth)
    birth + 1e9
  end
end
