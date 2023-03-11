int[] SetMas(int size, int min, int max)
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
int SumMas(int[] mas) //agreed that position == index
{
    int sum = 0;
    for (int i = 0; i < mas.Length; i++)
        if (i % 2 != 0) sum = sum + mas[i];
    return sum;
}
Console.WriteLine("Program returnes summa of elements with odd indexes in Array");
Console.Write("Please, Input Size of Array = ");
int size = Convert.ToInt32(Console.ReadLine());
Console.Write("Please, Input min value ");
int min = Convert.ToInt32(Console.ReadLine());
Console.Write("Please, Input max value ");
int max = Convert.ToInt32(Console.ReadLine());
int[] array = SetMas(size, min, max);
ShowMas(array,'_');
Console.WriteLine( array.Length > 1 ? $"In this Array with {size} elements we have summa of odd elements = {SumMas(array)}" : "Array has only one element");