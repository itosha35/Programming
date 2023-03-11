Console.Write("Input A = ");
int a = Convert.ToInt32(Console.ReadLine());
Console.Write("Input B = ");
int b = Convert.ToInt32(Console.ReadLine());
if (a>b)
    Console.WriteLine("A > B : " + Convert.ToString(a)+" > "+Convert.ToString(b));
else if (a<b)
    Console.WriteLine("A < B : "+ Convert.ToString(a)+" < "+Convert.ToString(b));
else
    Console.WriteLine("A = B : "+ Convert.ToString(a)+" = "+Convert.ToString(b));

