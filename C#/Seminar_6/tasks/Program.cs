/* bool TreangleCheck(int a, int b, int c)
{
    return (a < b + c && b < a + c && c < a + b);
}
Console.WriteLine("Treangle ceck Program");
Console.Write("input a = ");
int a = Convert.ToInt32(Console.ReadLine());
Console.Write("input b = ");
int b = Convert.ToInt32(Console.ReadLine());
Console.Write("input c = ");
int c = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(TreangleCheck(a,b,c) ? "YES it is treangle":"NO, it is not" );
*/
/*int[] Fibbonachi(int a, int b, int size)
{
    int[] mas = new int[size];
    mas[0] = a;
    mas[1] = b;
    for (int i = 2; i < size; i++)
        mas[i] = mas[i - 1] + mas[i - 2];
    return mas;
}
void ShowMas(int[] mas)
{
    Console.Write("[");
    for (int i = 0; i < mas.Length; i++)
    {
        if (i != mas.Length - 1) Console.Write($"{mas[i]}:");
        else Console.Write($"{mas[i]}]");
    }
    Console.WriteLine();
}
Console.WriteLine("Fibbo Program");
Console.Write("input a = ");
int a = Convert.ToInt32(Console.ReadLine());
Console.Write("input b = ");
int b = Convert.ToInt32(Console.ReadLine());
*/
int[] CopyMas(int[] mas)
{
    int[] array = new int[mas.Length];
    for (int i = 0; i < mas.Length; i++)
        array[i] = mas[i];
    return array;
}
void ShowMas(int[] mas)
{
    Console.Write("[");
    for (int i = 0; i < mas.Length; i++)
    {
        if (i != mas.Length - 1) Console.Write($"{mas[i]}:");
        else Console.Write($"{mas[i]}]");
    }
    Console.WriteLine();
}
int[] SetMas(int size, int min, int max)
{
    int[] mas = new int[size];
    for (int i = 0; i < size; i++)
        mas[i] = new Random().Next(min, max+1);
    return mas;
}
Console.WriteLine("Program Copy Mas");
Console.Write("Input size = ");
int size = Convert.ToInt32(Console.ReadLine());
Console.Write("Input MIN value = ");
int min = Convert.ToInt32(Console.ReadLine());
Console.Write("Input MAX value = ");
int max = Convert.ToInt32(Console.ReadLine());
int[] mas1 = SetMas(size,min,max);
ShowMas(mas1);
int[] mas2 = CopyMas(mas1);
ShowMas(mas2);