class Dive

  class Error < StandardError; end

  def initialize()
    @position = 0
    @depth = 0
  end

  def process(filepath)
    for instructions in File.open(filepath).read().split().each_slice(2).to_a do
      go(instructions[0], instructions[1].to_i)
    end
  end

  def go(instruction, displacement)
    case instruction
    when "forward"
        @position += displacement
    when "up"
        @depth -= displacement
    when "down"
        @depth += displacement
    end
  end

  def position
    @position
  end

  def depth
    @depth
  end

end