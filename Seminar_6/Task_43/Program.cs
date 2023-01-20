bool CheckParallel(double k1, double k2)//Parallelism check
{
    return (k1 == k2);
}
double LinesAngle(double k1, double k2)//Degrees
{
    if (k1 * k2 == -1) return 90.0;
    else return Math.Round((Math.Atan((k2 - k1) / (1 + k1 * k2)) / Math.PI) * 180, 1);
}
double[] PointIntersec(double k1, double k2, double b1, double b2)//Parallel check is at another method
{
    double[] point = new double[2];
    point[0] = (b2 - b1) / (k1 - k2);
    point[1] = k1 * point[0] + b1;
    return point;
}
Console.Clear();
Console.WriteLine("Intersection Point Program");
Console.Write("LINE-1, please, set k1 = ");
double k1 = Convert.ToDouble(Console.ReadLine());
Console.Write("LINE-1, please, set b1 = ");
double b1 = Convert.ToDouble(Console.ReadLine());
Console.Write("LINE-2, please, set k2 = ");
double k2 = Convert.ToDouble(Console.ReadLine());
Console.Write("LINE-2, please, set b2 = ");
double b2 = Convert.ToDouble(Console.ReadLine());
if (!CheckParallel(k1, k2) && (k1 != k2) && (b1 != b2))
{
    double[] point = PointIntersec(k1, k2, b1, b2);
    Console.WriteLine(b1 >= 0 ? $"LINE-1: Y(X)= {k1}*X + {b1}" : $"LINE-1: Y(X)= {k1}*X - {Math.Abs(b1)}");
    Console.WriteLine(b2 >= 0 ? $"LINE-2: Y(X)= {k2}*X + {b2}" : $"LINE-1: Y(X)= {k2}*X - {Math.Abs(b2)}");
    Console.WriteLine($"Lines intersection point has [X, Y] = [{Math.Round(point[0], 1)}, {Math.Round(point[1], 1)}]");
    Console.WriteLine(LinesAngle(k1, k2) == 90 ? "Lines are Perpendicullar" : $"Angle between the lines is = {LinesAngle(k1, k2)} deg");
}
else if ((k1 == k2) && (b1 == b2)) Console.WriteLine("Lines matches each other");
else Console.WriteLine("Lines are parallel, there is no intersection point");