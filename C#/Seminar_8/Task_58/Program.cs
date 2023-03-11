int[,] GenMatrix2d(int rows, int columns, int min, int max)
{
    int[,] mas = new int[rows, columns];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            mas[i, j] = new Random().Next(min, max + 1);
    return mas;
}
int[,] InputMatrix2d(int rows, int columns, string message)
{
    int[,] matrix = new int[rows, columns];
    for (int i = 0; i < rows; i++)
    {
        Console.WriteLine(message + $" : {rows} x {columns}");
        Console.WriteLine($"Please, set element of the {i} row");
        for (int j = 0; j < columns; j++)
        {
            Console.Write($"Input [{i} , {j}] element = ");
            matrix[i, j] = Convert.ToInt32(Console.ReadLine());
        }
        Console.Clear();
    }
    return matrix;
}
int InputGen(string message)
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
void ShowMatrix2d(int[,] mas)
{
    for (int i = 0; i < mas.GetLength(0); i++)
    {
        for (int j = 0; j < mas.GetLength(1); j++)
            Console.Write(mas[i, j] + "\t");
        Console.WriteLine();
    }
}
int[,] MultiplyMatrix(int[,] mA, int[,] mB)
{
    int[,] result = new int[mA.GetLength(0), mB.GetLength(1)];
    for (int i = 0; i < result.GetLength(0); i++)
        for (int j = 0; j < result.GetLength(1); j++)
            for (int k = 0; k < mA.GetLength(1); k++)
                result[i, j] = result[i, j] + mA[i, k] * mB[k, j];
    return result;
}
Console.Clear();
Console.WriteLine("Program Matrixes multiplication");
Console.WriteLine("NOTE: Two Matrix must follow: A[m * k] and B[k * n]");
Console.WriteLine("Do You want to Generate of Input Matrix A and B (Y/N)?");
string ask = Console.ReadLine();
int m = InputGen("Please, input Rows of Matrix A [m * k]");
int k = InputGen("Please, input Columns of Matrix A [m * k]");
int n = InputGen("Please, input Columns of Matrix B [k * n]");
int[,] matrixA = new int[m,k];
int[,] matrixB = new int[k,n];
if (ask[0] == 'Y' || ask[0] == 'y')
{
    matrixA = InputMatrix2d(m, k, "Matrix A");
    matrixB = InputMatrix2d(k, n, "Matrix B");
}
else
{
    int min = InputGen("Please, input MIN value");
    int max = InputGen("Please, input MAX value");
    matrixA = GenMatrix2d(m, k, min, max);
    matrixB = GenMatrix2d(k, n, min, max);
}
Console.WriteLine($"Matrix A [{m} , {k}]");
ShowMatrix2d(matrixA);
Console.WriteLine($"Matrix B [{k} , {n}]");
ShowMatrix2d(matrixB);
Console.WriteLine("NOTE: A x B <> B x A ");
Console.WriteLine("Matrix A x B = ");
ShowMatrix2d(MultiplyMatrix(matrixA, matrixB));
