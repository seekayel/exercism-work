module BookKeeping
  VERSION=2
end

class Raindrops
  def self.convert(cnt)
    str=""
    str += "Pling" if cnt%3==0
    str += "Plang" if cnt%5==0
    str += "Plong" if cnt%7==0
    str += cnt.to_s if str==""
    str
  end

  # If the number contains 3 as a factor, output 'Pling'.
  # If the number contains 5 as a factor, output 'Plang'.
  # If the number contains 7 as a factor, output 'Plong'.
  # If the number does not contain 3, 5, or 7 as a factor,
  # just pass the number's digits straight through.

end
