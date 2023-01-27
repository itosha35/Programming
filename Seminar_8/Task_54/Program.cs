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
void ArrayLinesSort(int[,] mas, bool askending)
{
    for (int i = 0; i < mas.GetLength(0); i++)
        for (int k = 0; k < mas.GetLength(1) - 1; k++)
            for (int j = 0; j < mas.GetLength(1) - 1 - k; j++)
            {
                if (mas[i, j] > mas[i, j + 1] && askending)
                {
                    int temp = mas[i, j];
                    mas[i, j] = mas[i, j + 1];
                    mas[i, j + 1] = temp;
                }
                else if ((mas[i, j] < mas[i, j + 1] && !askending))
                {
                    int temp = mas[i, j];
                    mas[i, j] = mas[i, j + 1];
                    mas[i, j + 1] = temp;
                }
            }
}
Console.Clear();
Console.WriteLine("Program Rows 2d Array Sorting");
int rows = InputGen("Please, input Rows");
int columns = InputGen("Please, input Columns");
int min = InputGen("Please, input MIN value");
int max = InputGen("Please, input MAX value");
int[,] mas = CreateRandom2dArray(rows, columns, min, max);
Show2dArray(mas);
Console.WriteLine("PLease, set Y or Yes for Askending sorting of Array, or any symbol for Descending");
string askdlg = Console.ReadLine();
bool askend = false;
if (askdlg[0] == 'y' || askdlg[0] == 'Y') askend = true;
ArrayLinesSort(mas, askend);
Console.WriteLine(askend ? "---ASKENDING rows sorted---":"---DESCENDING rows sorted---");
Show2dArray(mas);