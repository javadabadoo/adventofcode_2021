require 'minitest/autorun'
require_relative '../lib/dive'

class DiveTest < Minitest::Test

  def test_first_case_example
    dive = Dive.new
    dive.process("./resources/example.txt", :part_1)
    assert_equal 150, dive.position * dive.depth
  end

  def test_first_case
    dive = Dive.new
    dive.process("./resources/data.txt", :part_1)
    assert_equal 1459206, dive.position * dive.depth
  end

  def test_second_case_example
    dive = Dive.new
    dive.process("./resources/example.txt", :part_2)
    assert_equal 900, dive.position * dive.depth
  end

  def test_second_case
    dive = Dive.new
    dive.process("./resources/data.txt", :part_2)
    assert_equal 1320534480, dive.position * dive.depth
  end
end