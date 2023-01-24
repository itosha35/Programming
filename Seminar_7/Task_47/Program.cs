double[,] SetMasDouble(int row, int column, int min, int max) //Array Double Generating
{
    double[,] mas = new double[row, column];
    for (int i = 0; i < row; i++)
        for (int j = 0; j < column; j++)
            mas[i, j] = new Random().Next(min, max) + new Random().NextDouble();
    return mas;
}
void ShowMasDouble(double[,] mas, int digits) //Array Double Show with tab
{
    for (int i = 0; i < mas.GetLength(0); i++)
    {
        for (int j = 0; j < mas.GetLength(1); j++)
            Console.Write(Math.Round(mas[i, j], digits) + "\t");
        Console.WriteLine();
    }
}
int InputGen(string message)//Input Generator of Integer data
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
Console.Clear();
Console.WriteLine("Program of Double 2D Array generator");
int n = InputGen("Please, input Rows of Array = ");
int m = InputGen("Please, input Columns of Array = ");
int min = InputGen("Please, input MIN value in Array = ");
int max = InputGen("Please, input MAX value in Array = ");
int digit = InputGen("Please, input Digits after comma = ");
double[,] mas2D = SetMasDouble(n, m, min, max);
ShowMasDouble(mas2D, digit);