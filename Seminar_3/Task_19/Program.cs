bool Palindrom(int number)
{
  int decim = 10;
 int temp = number;
 int revers = 0;
 while (number % decim < number)
    decim*= 10;         
 decim = decim/10;   
 if (decim < 10)
    return true;
 else 
 {
  while (decim >= 1)
   {
    revers = revers + temp % 10 * decim;
    temp = temp / 10;
    decim = decim / 10;
   } 
 if (number == revers)
   return true;
 else return false;
 }  
}

int num = 0;
Console.WriteLine("PALINDROM");
Console.WriteLine("NOTE : set NEGATIVE number to ESCAPE");

while (num >= 0)
{
 Console.WriteLine("Please, Input number:");
 num = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"Number is {num}, Check for Palindrom = ");
Console.WriteLine( Palindrom(num) ? "YES! Number is Palindrom!" : " NO! Number is not Palindrom!");
}