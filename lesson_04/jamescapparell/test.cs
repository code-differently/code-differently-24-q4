using System;

public class Program
{
    public static void Main(string[] args)
        {
           
        Console.WriteLine($"{IsPrime(24)}");
        Console.WriteLine($"{IsPrime(179)}");
        }

    public static bool IsPrime(int n)
    {
        // Basic checks
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check for factors from 5 to sqrt(n)
        for (int i = 5; i * i <= n; i += 6)
        {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
