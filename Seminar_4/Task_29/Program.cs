int[] SetMas(int size)
{
    int[] mas = new int[size];
    for (int i = 0; i < size; i++)
    {
        Console.Write($"Set {i+1} : ");
        mas[i] = Convert.ToInt32(Console.ReadLine());        
    }
    Console.WriteLine();
    return mas;
}
void ShowMas(int[] mas)
{
    Console.Write("|");
    for (int i = 0; i < mas.Length; i++)
        Console.Write($"{mas[i]}|");
    Console.WriteLine();
}
Console.WriteLine("Programm Set - Print Array");
Console.Write("Please, set the size of Array = ");
int size = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"Please, input all {size} elements:");
int[] array = SetMas(size);
ShowMas(array);