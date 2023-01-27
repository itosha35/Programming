int[,] CreateRandom2dArray(int rows, int columns, int min, int max)
{
    int[,] mas = new int[rows, columns];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            mas[i, j] = new Random().Next(min, max + 1);
    return mas;
}
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
int[] GetRowSum(int[,] mas)
{
    int[] sum = new int[mas.GetLength(0)];
    for (int i = 0; i < mas.GetLength(0); i++)
        for (int j = 0; j < mas.GetLength(1); j++)
            sum[i] += mas[i, j];
    return sum;
}
int GetMinSumNumber(int[] mas)
{
    int minind = 0;
    for (int i = 1; i < mas.Length; i++)
        if (mas[minind] > mas[i]) minind = i;
    return minind + 1;
}
Console.Clear();
Console.WriteLine("Program Rows 2d Array Sorting");
int rows = InputGen("Please, input Rows");
int columns = InputGen("Please, input Columns");
int min = InputGen("Please, input MIN value");
int max = InputGen("Please, input MAX value");
int[,] mas = CreateRandom2dArray(rows, columns, min, max);
Show2dArray(mas);
Console.WriteLine($"The row with the Lowest sum has a Number = {GetMinSumNumber(GetRowSum(mas))}");