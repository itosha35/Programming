int[] SetMas(int size)
{
    int[] mas = new int[size];
    for (int i = 0; i < size; i++)
        mas[i] = new Random().Next(100, 1000);
    return mas;
}
void ShowMas(int[] mas)
{
    Console.Write("[");
    for (int i = 0; i < mas.Length; i++)
    {
        if (i != mas.Length - 1) Console.Write($"{mas[i]},");
        else Console.Write($"{mas[i]}]");
    }
    Console.WriteLine();
}
int CountEven(int[] mas)
{
    int count = 0;
    for (int i = 0; i < mas.Length; i++)
        if (mas[i] % 2 == 0) count++;
    return count;
}
Console.WriteLine("Program returnes count of even numbers in Array Please");
Console.Write("Please, Input Size of Array = ");
int size = Convert.ToInt32(Console.ReadLine());
int[] array = SetMas(size);
ShowMas(array);
Console.WriteLine($"In this Array we have: {CountEven(array)} even elements");
