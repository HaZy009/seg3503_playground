defmodule Grades.Calculator do
  def percentage_grade(grades) do
    homework_average = average(grades.homework)
    labs_average = average(grades.labs)
    midterm = to_number(grades.midterm)
    final_exam = to_number(grades.final)

    homework_average * 0.15 +
      labs_average * 0.15 +
      midterm * 0.30 +
      final_exam * 0.40
  end

  def letter_grade(grades) do
    percent = percentage_grade(grades)

    cond do
      percent >= 90 -> "A+"
      percent >= 85 -> "A"
      percent >= 80 -> "A-"
      percent >= 75 -> "B+"
      percent >= 70 -> "B"
      percent >= 65 -> "C+"
      percent >= 60 -> "C"
      percent >= 55 -> "D+"
      percent >= 50 -> "D"
      true -> "E"
    end
  end

  def numeric_grade(grades) do
    percent = percentage_grade(grades)

    cond do
      percent >= 90 -> 10
      percent >= 85 -> 9
      percent >= 80 -> 8
      percent >= 75 -> 7
      percent >= 70 -> 6
      percent >= 65 -> 5
      percent >= 60 -> 4
      percent >= 55 -> 3
      percent >= 50 -> 2
      true -> 0
    end
  end

  defp average(values) do
    numbers = Enum.map(values, &to_number/1)

    if Enum.empty?(numbers) do
      0
    else
      Enum.sum(numbers) / length(numbers)
    end
  end

  defp to_number(value) when value in [nil, ""] do
    0
  end

  defp to_number(value) do
    {number, _} = Float.parse(value)
    number
  end
end