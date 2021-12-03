class Dive

  class Error < StandardError; end

  def initialize()
    @position = 0
    @depth = 0
    @aim = 0
  end

  def process(filepath, part)
    for instructions in File.open(filepath).read().split().each_slice(2).to_a do
      :part_1 == part ? go_part_1(instructions[0], instructions[1].to_i) : go_part_2(instructions[0], instructions[1].to_i)
    end
  end

  def go_part_1(instruction, displacement)
    case instruction
    when "forward"
        @position += displacement
    when "up"
        @depth -= displacement
    when "down"
        @depth += displacement
    end
  end

  def go_part_2(instruction, displacement)
    case instruction
    when "forward"
        @position += displacement
        @depth += @aim * displacement
    when "up"
        @aim -= displacement
    when "down"
        @aim += displacement
    end
  end

  def position
    @position
  end

  def depth
    @depth
  end

  def aim
    @aim
  end

end