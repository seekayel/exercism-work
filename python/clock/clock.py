class Clock:

  def __init__(self, hours, mins):
    self.hours=hours
    self.mins=mins
    self.roll_over()

  def __str__(self):
    return "{:02d}:{:02d}".format(self.hours,self.mins)

  def add(self, mins):
    self.mins += mins
    self.roll_over()
    return self

  def roll_over(self):
    h_roll = self.mins//60
    m = self.mins - h_roll*60
    h = self.hours + h_roll

    #print("[{}] h_roll[{}] h[{}] m[{}]".format(str(self),h_roll,h,m))
    self.hours = h%24
    self.mins = m

  def __eq__(self, other):
    return self.__dict__ == other.__dict__

