require 'minitest/autorun'
require_relative '../lib/dive'

class DiveTest < Minitest::Test

  def test_first_case_example
    dive = Dive.new
    dive.process("./resources/part_01_example.txt")
    assert_equal 150, dive.position * dive.depth
  end

  def test_first_case
    dive = Dive.new
    dive.process("./resources/part_01_data.txt")
    assert_equal 1459206, dive.position * dive.depth
  end
end