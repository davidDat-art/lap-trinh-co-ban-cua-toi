using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bai1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n;
            int S = 0;

            Console.Write("Nhap n: ");
            n = int.Parse(Console.ReadLine());

            for (int i = 1; i <= n; i++)
            {
                S = S + i;
            }

            Console.WriteLine("S = " + S);
            Console.ReadKey();
        }
    }
}