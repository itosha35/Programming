bool Compare(int num1, int num2)
{
    return num1 % num2 == 0;
}

int a = Convert.ToInt32(Console.ReadLine());
int b = Convert.ToInt32(Console.ReadLine());

Console.WriteLine($"First number is {a}, second number is {b}, {Compare(a,b)}");

