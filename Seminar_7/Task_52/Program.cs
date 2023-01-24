int[,] CreateRandom2dArray(int rows, int columns, int min, int max)
{
    int[,] mas = new int[rows, columns];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            mas[i, j] = new Random().Next(min, max + 1);
    return mas;
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
int InputGen(string message)
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
double[] ColumnMean(int[,] mas)
{
    double[] mean = new double[mas.GetLength(1)];//Derrive the size of Array with Means
    for (int i = 0; i < mas.GetLength(1); i++)
    {
        for (int j = 0; j < mas.GetLength(0); j++)
            mean[i] += mas[j, i];
        mean[i] = mean[i] / mas.GetLength(0);
    }
    return mean;
}
void ShowMas(double[] mas, int digits)
{
    Console.Write("[");
    for (int i = 0; i < mas.Length; i++)
    {
        if (i != mas.Length - 1) Console.Write($"{Math.Round(mas[i], digits)} : ");
        else Console.Write($"{Math.Round(mas[i], digits)}]");
    }
    Console.WriteLine();
}
Console.Clear();
Console.WriteLine("Program Mean of the Columns of the Array");
int rows = InputGen("Please, input Rows");
int columns = InputGen("Please, input Columns");
int min = InputGen("Please, input MIN value");
int max = InputGen("Please, input MAX value");
int[,] mas = CreateRandom2dArray(rows, columns, min, max);
Show2dArray(mas);
int digits = InputGen("Please, input digits after comma");
Console.WriteLine("Arithmetical Means of the each Column are");
ShowMas(ColumnMean(mas), digits);