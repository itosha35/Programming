int PowerN(int n, int b)
{
    int rezult = 1;
    for (int i = 1; i <= b; i++)
        rezult *= n;
    return rezult;
}
Console.WriteLine("Power N program");
Console.Write("Please, set N = ");
int num = Convert.ToInt32(Console.ReadLine());
Console.Write("Please, set power to raise A = ");
int b = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"The Power {b} of {num} is {PowerN(num, b)}");