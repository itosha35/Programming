double[] SetMas(int size, int min, int max)
{
    double[] mas = new double[size];
    for (int i = 0; i < size; i++)
        mas[i] = new Random().Next(min, max) + new Random().NextDouble();
    //Max value of Rand.INT will be max-1, but Random.Double can be max 1, so, everything is cool;
    return mas;
}
void ShowMas(double[] mas, int digits)
{
    Console.Write("[");
    for (int i = 0; i < mas.Length; i++)
    {
        if (i != mas.Length - 1) Console.Write($"{Math.Round(mas[i], digits)}:");
        else Console.Write($"{Math.Round(mas[i], digits)}]");
    }
    Console.WriteLine();
}
double MaxMinDif(double[] mas, int digits)
{
    int maxi = 0; // for indexes, int has lower memory requiremens caompare to double type
    int mini = 0;
    for (int i = 1; i < mas.Length; i++)
    {
        if (mas[i] > mas[maxi])
            maxi = i;
        if (mas[i] < mas[mini])
            mini = i;
    }
    Console.WriteLine($"MAX is {Math.Round(mas[maxi], digits)}, MIN is {Math.Round(mas[mini], digits)}");
    return Math.Round(mas[maxi] - mas[mini], digits);
}
Console.WriteLine("Program difference betweeen MAX and MIN in Array");
Console.Write("Please, Input Size of Array = ");
int size = Convert.ToInt32(Console.ReadLine());
Console.Write("Please, Input min value ");
int min = Convert.ToInt32(Console.ReadLine());
Console.Write("Please, Input max value ");
int max = Convert.ToInt32(Console.ReadLine());
double[] array = SetMas(size, min, max);
Console.Write("Please, Input digits after comma = ");
int digits = Convert.ToInt32(Console.ReadLine());
ShowMas(array, digits);
Console.WriteLine($"Difference between MAX and MIN is = {MaxMinDif(array, digits)}");