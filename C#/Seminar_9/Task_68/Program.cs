int Akkerman(int n, int m)
{
    if (n == 0) return m + 1;
    else if (m == 0) return Akkerman(n - 1, 1);
    else return Akkerman(n - 1, Akkerman(n, m - 1));
}
int InputGen(string message)
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
Console.WriteLine("Programm Akkerman (m, n)");
Console.WriteLine("NOTE: Akkerman function increases very fast \n Pay attention on m and n numbers!");
Console.WriteLine($"Akkerman = " + Akkerman(InputGen("Please, input m"),InputGen("Please, input n")));