﻿bool Vacation(byte num)
{
 if (num == 6 || num == 7)
    return true;
else return false;
}

bool check = false;
byte day = 0;
while (!check)
{
 Console.WriteLine("Input week day number");
 day = Convert.ToByte(Console.ReadLine());
 if (day > 0 && day < 8)
    check=true;
}
Console.WriteLine( Vacation(day) == true ? "YES!" : "NO, keep working!");