void Cubics(int num)
{
    int i = 1;
    while (i < num)
    {
        Console.Write($" {Math.Pow(i,3)} :");
        i+=1;
    }
    Console.Write($" {Math.Pow(num,3)}");
}

Console.WriteLine("Program sets all Cubics from 1 to N");
Console.Write("Please, input N = ");
Cubics(Convert.ToInt32(Console.ReadLine()));