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
            Console.Write(mas[i, j] + "\t");
        Console.WriteLine();
    }
}
int[,] FillSpiralArray(int rows, int columns)
{
    int[,] mas = new int[rows, columns];
    // cycle can be devided on 4 steps:
    //left to right = -1 row, stepi
    //top to down = -1 column, stepj
    //right to left = -1 row, stepi
    //down to top = -1 column, stepj
    byte seq = 1;
    if (seq == 1) // Row number <i> on HOLD, filling row by columns <j>
    {
        for (int j = posj; i < columns - stepj; j++)
            
            seq++;
    }
    if (seq == 2)
    {
        seq++;
    }

    if (seq == 3)
    {
        seq++;
    }
    if (seq == 4)
    {
        seq++;
    }
    return mas;
}

/*
Array numbers
00 01 02 03
11 12 13 04
10 15 14 05
09 08 07 06
indexes
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
Step counts
step 1 = columns
step 2 = rows - 1
step 3 = columns - 1
step 4 = rows - 2
step 5 = columns - 2
step 6 = rows - 3
step 7 = columns - 3
*/