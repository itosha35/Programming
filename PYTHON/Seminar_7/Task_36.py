def print_operation_table(operation, rows, columns):
    print(operation(rows, columns))

def operation(rows,columns):
    return rows*columns


def main():
    #print_operation_table(lambda r, c: r*c, 6, 6)
    print_operation_table(operation,6,6)


if __name__ == '__main__':
    main()
