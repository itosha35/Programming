int[,] CreateRandom2dArray()
{
    Console.Write("Input a number of rows: ");
    int rows = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a number of columns: ");
    int columns = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a min number: ");
    int min = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a max number: ");
    int max = Convert.ToInt32(Console.ReadLine());
    int[,] array = new int[rows, columns];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            array[i, j] = new Random().Next(min, max + 1);
    return array;
}
void Show2dArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)//rows indexes
    {
        for (int j = 0; j < array.GetLength(1); j++)//columns indexes
            Console.Write(array[i, j] + "\t");
        Console.WriteLine();
    }
    Console.WriteLine();
}
Console.Clear();
int[,] newarray = CreateRandom2dArray();
Show2dArray(newarray);
