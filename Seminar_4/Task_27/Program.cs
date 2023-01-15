int Summ(int num)
{
    int summa = 0;
    while (num != 0)
    {
        summa = summa + num % 10;
        num /= 10;
    }
    return summa;
}
Console.WriteLine("Summa of digits in Number");
Console.Write("Please, set the Number = ");
int number = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"The summa of digits in {number} is {Summ(number)}");