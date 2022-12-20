bool Vacation(int num)
{
 if (num == 6 || num == 7)
    return true;
else return false;
}

bool check = false;
int day = 0;
while (!check)
{
 Console.WriteLine("Input week day number");
 day = Convert.ToInt32(Console.ReadLine());
 if (day > 0 && day < 8)
    check=true;
}
Console.WriteLine( Vacation(day) == true ? "YES!" : "NO, keep working!");