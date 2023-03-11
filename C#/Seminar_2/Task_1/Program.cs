int compareDigits(int number)
{
    if (number / 10 > number%10)
    return number/10;
    else return number %10;
}

int n = new Random().Next(10,100);
int digit = compareDigits(n);
Console.WriteLine($"Number is {n}, result is {digit}");
