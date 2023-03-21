def solve_expression(sequence: tuple, expression: str = '') -> None:
    if len(sequence) == 1:
        expression += f'{sequence[0]}'
        if eval(expression) == 100:
            print(f'{expression} == 100')
    else:
        solve_expression(sequence[1:], expression + f'{sequence[0]}')
        solve_expression(sequence[1:], expression + f'{sequence[0]} + ')
        solve_expression(sequence[1:], expression + f'{sequence[0]} - ')


def main():
    sequence_of_digits = (1, 2, 3, 4, 5, 6, 7, 8, 9)
    solve_expression(sequence_of_digits)


if __name__ == '__main__':
    main()
