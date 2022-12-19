bool SqrtAB(int num1, int num2)
{
    if (num2 == num1*num1 || num1 == num2*num2) return true;
    else return false;
}

Console.WriteLine("Вводи числа A B");
int a = Convert.ToInt32(Console.ReadLine());
int b = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"First number is {a}, second number is {b}, {SqrtAB(a,b)}");
