int Hundred(int num)
{
    return num/10 % 10;    
}

bool check = false;
int number = 0;
while (!check)
{
 Console.WriteLine("Please input number between 100 and 999 inclusive");
 number = Convert.ToInt32(Console.ReadLine());
 if (number / 100 > 0 && number / 100 < 10)
  {
   check=true;
   Console.WriteLine($"Number is {number}, second digit is {Hundred(number)}");
  }
else check=false;
}

