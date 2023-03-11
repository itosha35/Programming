void NaturalSet(int number)
{
    if (number > 1)
    {
        Console.Write(number + ", ");
        NaturalSet(number - 1);
    }
    else Console.Write(number);   
}
int InputGen(string message)
{
    Console.Write(message + " = ");
    return Convert.ToInt32(Console.ReadLine());
}
NaturalSet(InputGen("Please, Input Number"));