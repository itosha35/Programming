int[,,] Set3dArray(int[] numberset, int rows, int columns, int layers)//Filling the 3D Array with Uniq numbers
{
    int[,,] mas = new int[rows, columns, layers];
    int l = 0;
    for (int k = 0; k < layers; k++)
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
            {
                mas[i, j, k] = numberset[l];
                l++;
            }
    return mas;
}
int[] GenNumSet(int size)// Generating uniq numbers set for 3D Array fill, MAX = 90 numbers
{
    int[] seq = new int[size];
    for (int i = 0; i < size; i++)
    {
        bool ok = false;
        int num = 0;
        while (!ok)
        {
            num = new Random().Next(10, 100);
            int k = 0;
            for (int j = 0; j < i; j++)
                if (seq[j] != num) k++;
            if (k == i) ok = true;
            else ok = false;
        }
        seq[i] = num;
    }
    return seq;
}
int InputGen(string message)
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
void Show3dArray(int[,,] mas)// Show the 3D Array layer-by-layer
{
    for (int k = 0; k < mas.GetLength(2); k++)
    {
        Console.WriteLine($"=== Layer {k + 1} ===");
        for (int i = 0; i < mas.GetLength(0); i++)
        {
            for (int j = 0; j < mas.GetLength(1); j++)
            {
                if (j != mas.GetLength(1) - 1) Console.Write($"{mas[i, j, k]} : ");
                else Console.Write($"{mas[i, j, k]}");
            }
            Console.WriteLine();
        }
    }
}
bool CheckNumQuantity(int rows, int columns, int layers) // max 90 numbers consist from 2 digits
{
    return (rows * columns * layers) <= 90;
}
Console.Clear();
Console.WriteLine("Program 3d Array fill with unig 2-digits numbers");
int rows = InputGen("Please, input Rows of 3d Array");
int columns = InputGen("Please, input Columns of 3d Array");
int layers = InputGen("Please, input Layers of 3d Array");
if (CheckNumQuantity(rows, columns, layers))//Check if Arrays dimensions are not out of 2-digits set
{
    int[] numbers = GenNumSet(rows * columns * layers);
    Console.WriteLine($"3d Array [{rows} , {columns} , {layers}] has = {numbers.Length} elements");
    Show3dArray(Set3dArray(numbers, rows, columns, layers));
}
else
{
    Console.WriteLine($"Sorry, but Array of [{rows} , {columns} , {layers}] = {rows * columns * layers} elements.");
    Console.WriteLine("Maximum elements quantity is 90 (2-digits numbers)");
}