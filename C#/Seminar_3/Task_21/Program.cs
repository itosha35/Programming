double Distance3D(double x1, double y1, double z1, double x2, double y2, double z2, byte digits)
{
    return Math.Round(Math.Sqrt(Math.Pow(x1 - x2, 2) + Math.Pow(y1 - y2, 2) + Math.Pow(z1 - z2, 2)), digits);
}

Console.WriteLine("Distance 3D between 2 points A and B");
Console.WriteLine("Set coordinates for point A first:");
Console.Write("Set Ax = ");
double Ax = Convert.ToDouble(Console.ReadLine());
Console.Write("Set Ay = ");
double Ay = Convert.ToDouble(Console.ReadLine());
Console.Write("Set Az = ");
double Az = Convert.ToDouble(Console.ReadLine());
Console.WriteLine("Set coordinates for point B:");
Console.Write("Set Bx = ");
double Bx = Convert.ToDouble(Console.ReadLine());
Console.Write("Set By = ");
double By = Convert.ToDouble(Console.ReadLine());
Console.Write("Set Bz = ");
double Bz = Convert.ToDouble(Console.ReadLine());
Console.WriteLine($" POINT A ({Ax},{Ay},{Az}) and POINT B ({Bx},{By},{Bz}))"); 
Console.WriteLine($"Distance between A & B = {Distance3D(Ax,Ay,Az,Bx,By,Bz,2)}");