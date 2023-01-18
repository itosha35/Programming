double[] SetMas(int size, int min, int max)
{
    int[] mas = new int[size];
    for (int i = 0; i < size; i++)
        mas[i] = new Random().Next(min, max + 1);
    return mas;
}
void ShowMas(int[] mas, char symb)
{
    Console.Write("[");
    for (int i = 0; i < mas.Length; i++)
    {
        if (i != mas.Length - 1)
        {
            if (i % 2 != 0) Console.Write($"{symb}{mas[i]},");
            else Console.Write($"{mas[i]},");
        }
        else
        {
            if (i % 2 != 0) Console.Write($"{symb}{mas[i]}]");
            else Console.Write($"{mas[i]}]");
        }
    }
    Console.WriteLine();
}
