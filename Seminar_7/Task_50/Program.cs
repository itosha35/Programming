int[,] CreateSomeRandArray()// Some Secret Array creator
{
    int rows = new Random().Next(1, 11);
    int columns = new Random().Next(1, 11);
    int min = new Random().Next(0, 11) * (-1);
    int max = new Random().Next(0, 11);
    int[,] mas = new int[rows, columns];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            mas[i, j] = new Random().Next(min, max + 1);
    return mas;
}
int InputGen(string message)//Input Generator of Integer data
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
void Show2dArray(int[,] mas)//Array print
{
    Console.WriteLine($"Generated Array is {mas.GetLength(0)} x {mas.GetLength(1)}");
    for (int i = 0; i < mas.GetLength(0); i++)
    {
        for (int j = 0; j < mas.GetLength(1); j++)
            Console.Write(mas[i, j] + "\t");
        Console.WriteLine();
    }
    Console.WriteLine();
}
string IndexesCheck(int[,] mas, int i, int j)
{
    if (i < mas.GetLength(0) && j < mas.GetLength(1))
        return $"Element [{i} , {j}] = "+Convert.ToString(mas[i, j]);
    else return $"[{i} , {j}] - Indexes are out of Array elements Range";
}
Console.Clear();
int[,] mas = CreateSomeRandArray();
Show2dArray(mas);
int i = InputGen("Please, input Row Index of Array");
int j = InputGen("Please, input Column Index of Array");
Console.WriteLine(IndexesCheck(mas, i, j));