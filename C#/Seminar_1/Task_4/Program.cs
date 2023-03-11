Console.Write("Input Number > 1 = ");
int n = Convert.ToInt32(Console.ReadLine());
int i=2;
while (i<=n) 
{
    Console.Write(i % 2==0 ? Convert.ToString(i):" ");
    i++;
}