Console.Clear();
int count = 0;
Console.WriteLine("Program count negative values set by User");
Console.Write("Please, set the number of elements to be set = ");
int m = Convert.ToInt32(Console.ReadLine());
for (int i = 1; i <= m; i++)
{
    Console.Write($"Please, input {i} element = ");
    int num = Convert.ToInt32(Console.ReadLine());
    if (num < 0) count++;
    Console.WriteLine(count != 0 ? $"You have set {count} negative numbers":"No negatives yet");
}
Console.WriteLine("Please, press any key to quit...");
Console.ReadLine();