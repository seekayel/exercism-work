module BookKeeping
  VERSION=3
end

class Squares
  attr_reader :square_of_sum, :sum_of_squares, :difference

  def initialize(n)
    @n = n
    @square_of_sum = ((n**2+n)/2)**2
    @sum_of_squares = (1..n).reduce(0){|c,i| c+i**2}
    @difference = @square_of_sum - @sum_of_squares
  end
end
