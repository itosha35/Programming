//Seminar 8
/* Task 1
int[,] CreateRandom2dArray()
{
    Console.Write("Input a number of rows: ");
    int rows = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a number of columns: ");
    int columns = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a min number: ");
    int min = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a max number: ");
    int max = Convert.ToInt32(Console.ReadLine());
    int[,] array = new int[rows, columns];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            array[i, j] = new Random().Next(min, max + 1);
    return array;
}
void Show2dArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)//rows indexes
    {
        for (int j = 0; j < array.GetLength(1); j++)//columns indexes
            Console.Write(array[i, j] + "\t");
        Console.WriteLine();
    }
    Console.WriteLine();
}
void Reverse2dArray(int[,] mas)
{
    if (mas.GetLength(0) != mas.GetLength(1))
    {
        Console.WriteLine("Not Square Array");
        return;
    }
    else
    {
        for (int i = 0; i < mas.GetLength(0) - 1 ; i++)
            for (int j = i+1; j < mas.GetLength(1); j++)
            {
                int temp = mas[i, j];
                mas[i, j] = mas[j, i];
                mas[j, i] = temp;                
            }
    }
}
int[,] mas = CreateRandom2dArray();
COnsole.Clear();
Show2dArray(mas);
Reverse2dArray(mas);
Show2dArray(mas);
*/
int[,] CreateRandom2dArray()
{
    Console.Write("Input a number of rows: ");
    int rows = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a number of columns: ");
    int columns = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a min number: ");
    int min = Convert.ToInt32(Console.ReadLine());
    Console.Write("Input a max number: ");
    int max = Convert.ToInt32(Console.ReadLine());
    int[,] array = new int[rows, columns];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            array[i, j] = new Random().Next(min, max + 1);
    return array;
}
void Show2dArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)//rows indexes
    {
        for (int j = 0; j < array.GetLength(1); j++)//columns indexes
            Console.Write(array[i, j] + "\t");
        Console.WriteLine();
    }
    Console.WriteLine();
}
int[] MinArrayIndex(int[,] mas)
{
    int[] indexes = new int[2];//index of row and index of column with MIN value
    indexes[0] = 0;
    indexes[1] = 0;
    for (int i = 0; i < mas.GetLength(0); i++)
        for (int j = 0; j < mas.GetLength(1); j++)        
            if (mas[i, j] < mas[indexes[0], indexes[1]])
            {
                indexes[0] = i;
                indexes[1] = j;
            }        
    return indexes;
}
int[,] RemoveMinIndexes(int[] indexes, int[,] mas)
{
    int[,] resmas = new int[mas.GetLength(0) - 1, mas.GetLength(1) - 1];
    int i2 = 0;
    int j2 = 0;
    for (int i = 0; i < mas.GetLength(0); i++)
    {
        if (i != indexes[0])
        {            
            for (int j = 0; j < mas.GetLength(1); j++)
            {
                if (j != indexes[1])
                {
                    resmas[i2, j2] = mas[i, j];
                    j2++;
                }

            }
            j2 = 0;
            i2++;
        }
    }
    return resmas;
}
int[,] mas = CreateRandom2dArray();
Show2dArray(mas);
int[] indexes = MinArrayIndex(mas);
int[,] mas2 = RemoveMinIndexes(indexes, mas);
Console.WriteLine($"MIN = [{indexes[0]} : {indexes[1]}] = {mas[indexes[0],indexes[1]]}");
Show2dArray(mas2);