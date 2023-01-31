int SumInterval(int n, int m)
{
    if (n > m) return m + SumInterval(n, m + 1);
    if (m > n) return n + SumInterval(n + 1, m);
    else return n;
}
int InputGen(string message)
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
Console.WriteLine(SumInterval(InputGen("Please, Input N"), InputGen("Please, Input M")));