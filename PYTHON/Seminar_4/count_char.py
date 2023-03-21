def using_dict(source: str) -> None:

    count_dict = {}
    stack = []
    for index in range(len(source)):
        el = source[index]
        if el.isalnum():
            count_dict[el] = source[:index].count(el)
            stack.append(el if not count_dict[el] else f'{el}_{count_dict[el]}')

    print('From using_dict\t->', ' '.join(stack))


def using_str(sequence: str):

    stack = []
    for index in range(len(sequence)):
        char = sequence[index]
        if not char.isalnum():
            continue
        counter = sequence[:index].count(char)
        stack.append(char if not counter else f'{char}_{counter}')
    print('From using_str\t->', ' '.join(stack))


def main() -> None:
    queue = 'a a a b c a a d c d d'
    using_str(queue)
    using_dict(queue)


if __name__ == '__main__':
    main()
