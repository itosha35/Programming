# Example of Python syntaxis
from random import randint


analyzed_period = int(input('Укажите анализируемый период, дней:\n>>> '))
observation_history = [randint(-50, 50) for _ in range(analyzed_period)]
longest_thaw = 0
current_length = 0
for day in observation_history:
    if 0 < day:
        current_length += 1
        if longest_thaw < current_length:
            longest_thaw = current_length
    else:
        current_length = 0
pretty_text = "\t;\n".join([f"{x[0]}\t|\t{x[1]}" for x in enumerate(observation_history, 1)])
print('Анализируемый период, день | температура:\n'
      f'{pretty_text}\t.\n'
      f'Самая длительная оттепель, дней -> {longest_thaw}')
