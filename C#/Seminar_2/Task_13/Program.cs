int Digits(int num)
{
  int decim=10;
 while (num/decim > 0)
  {
    decim*=10;
  }
  decim=decim/10;
 if (decim < 100)
    return -1;
 else 
 {
  num = num / (decim / 100) % 10;
  return num;
 }
}

Console.WriteLine("Input some number");
int number = Convert.ToInt32(Console.ReadLine());
Console.Write($"Number is {number}, third digit here is ");
Console.WriteLine( Digits(number) > -1 ? Digits(number) : " No third digit in this number");
