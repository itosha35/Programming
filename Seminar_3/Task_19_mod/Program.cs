bool Palindrom(int number)
{
    int temp = number;
    int revers = 0;
    while (temp / 10 > 0)
        {
            revers = revers*10 + temp % 10;
            temp = temp / 10;
        }  
     revers = revers*10 + temp % 10;
    if (number == revers)
            return true;
        else return false;
}

int num = 0;
Console.WriteLine("PALINDROM");
Console.WriteLine("NOTE : set NEGATIVE number to ESCAPE");

while (num >= 0)
{
    Console.WriteLine("Please, Input number:");
    num = Convert.ToInt32(Console.ReadLine());
    Console.WriteLine($"Number is {num}, Check for Palindrom = ");
    Console.WriteLine(Palindrom(num) ? "YES! Number is Palindrom!" : " NO! Number is not Palindrom!");
}