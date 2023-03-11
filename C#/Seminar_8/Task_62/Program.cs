int InputGen(string message)
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
void Show2dArray(int[,] mas)
{
    for (int i = 0; i < mas.GetLength(0); i++)
    {
        for (int j = 0; j < mas.GetLength(1); j++)
        {
            if (mas[i, j] < 10) Console.Write("0" + mas[i, j] + "\t");
            else Console.Write(mas[i, j] + "\t");
        }
        Console.WriteLine();
    }
}
int[,] FillSpiralArray(int rows, int columns)
{
    int[,] mas = new int[rows, columns];
    int dir = 1;
    int cycle = 0;
    int num = 0;
    while (num < rows * columns)
    {
        if (dir == 1)
        {
            for (int j = cycle; j < columns - cycle; j++)
            {
                num++;
                mas[cycle, j] = num;
                if (num >= rows * columns) return mas;
            }
            dir = 2;
        }
        if (dir == 2)
        {
            for (int i = 1 + cycle; i < rows - cycle; i++)
            {
                num++;
                mas[i, columns - cycle - 1] = num;
                if (num >= rows * columns) return mas;
            }
            dir = 3;
        }

        if (dir == 3)
        {
            for (int j = columns - 1 - cycle - 1; j >= 0 + cycle; j--)
            {
                num++;
                mas[rows - cycle - 1, j] = num;
                if (num >= rows * columns) return mas;
            }
            dir = 4;
        }
        if (dir == 4)
        {
            for (int i = rows - 1 - 1 - cycle; i >= 1 + cycle; i--)
            {
                num++;
                mas[i, cycle] = num;
                if (num >= rows * columns) return mas;
            }
            dir = 1;
            cycle++;
        }
    }
    return mas;
}
/*      EXPLANATION of Sequence
        //cycle 1
        moves[0, i] = 0          1         rows rows-1;//posi
        moves[1, i] = 0       columns columns -1   0;//posj
        moves[2, i] = columns  rows         0         1;//length
        //cycle 2
        moves[0, i] = 1          2         rows - 1     rows - 2;//posi
        moves[1, i] = 1       columns - 1    columns - 2   1;//posj
        moves[2, i] = columns - 1  rows - 1         1         2;//len
        //cycle 3
*/
Console.Clear();
Console.WriteLine("Program Spiral Array filling");
int rows = InputGen("Please, input Rows of 2d Array");
int columns = InputGen("Please, input Columns of 2d Array");
int[,] mas = FillSpiralArray(rows, columns);
Show2dArray(mas);