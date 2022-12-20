Console.Write("Input Number = ");
int numb = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(Convert.ToString(numb)+" - Четное?");
Console.WriteLine(numb % 2 == 0 ? "Да" : "Нет");