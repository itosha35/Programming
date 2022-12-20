Console.Write("Input A = ");
int a = Convert.ToInt32(Console.ReadLine());
Console.Write("Input B = ");
int b = Convert.ToInt32(Console.ReadLine());
Console.Write("Input C = ");
int c = Convert.ToInt32(Console.ReadLine());
if ((a>b)&(a>c))
    Console.WriteLine("A -> MAX = " + Convert.ToString(a));
else if ((b>a)&(b>c))
    Console.WriteLine("B -> MAX = " + Convert.ToString(b));
else if ((c>b)&(c>a)) 
    Console.WriteLine("C -> MAX = " + Convert.ToString(c));
else  
{
 if ((a==b)&(b==c))
    Console.WriteLine("All are equal = " + Convert.ToString(a));
 else if ((a==b)&(b!=c))
    {
    if (b>c) Console.WriteLine("A = B -> MAX = " + Convert.ToString(b));
    else Console.WriteLine("C -> MAX = " + Convert.ToString(c));
    }
 else
 {
    if (a>c) Console.WriteLine("A -> MAX = " + Convert.ToString(a));
    else Console.WriteLine("B = C -> MAX = " + Convert.ToString(c));
 }  
}