void ShowNum(int num)
{
    Console.Write(num + " ");
    if (num > 1) ShowNum(num - 1);
    Console.Write(num + " ");
}
int SumOfDigits(int num)
{
    if (num != 0) return SumOfDigits(num / 10) + num % 10;
    else return 0;
}
/*
f(123) -> f(12) + 3
f(12) -> f(1) + 2
f(1) -> f(0) + 1
f(0) -> 0
*/
//Console.WriteLine(SumOfDigits(123));
void getSet(int m, int n)
{
    Console.Write(m + " ");
    if (m < n) getSet(m + 1, n);
    if (m > n) getSet(m - 1, n);
}
//getSet(18, 10);
double AtoDegree(double a, int b)
{
    if (b > 0) return AtoDegree(a, b - 1) * a;
    if (b < 0) return AtoDegree(a, b + 1) * 1 / a;
    else return 1;
}
Console.Write(AtoDegree(2, 3) + "  " + AtoDegree(2, -3));
