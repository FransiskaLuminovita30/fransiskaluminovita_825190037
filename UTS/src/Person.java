import java.util.*;

public class Person
{
    double berat;
    double tinggi;
    double beratIdeal;

    static double HitungBeratBadanIdeal(double berat, double tinggi)
    {
        return (berat/(tinggi*tinggi));
    }

    static String Kategori(double beratIdeal)
    {
        if(beratIdeal > 30)
        {
            return "obesitas";
        }
        else if(beratIdeal > 25)
        {
            return "kelebihan berat badan";
        }
        else if(beratIdeal > 18.5)
        {
            return "memiliki berat badan yang ideal";
        }
        else
        {
            return "memiliki berat badan yang kurang";
        }
    }

    public static void main(String[] args)
    {
        Person person = new Person();
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Berat Badan Ideal Dengan Indeks Masa Tubuh (IMH)");
        System.out.print("Masukkan berat badan anda (Kg) : ");
        person.berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan anda (Cm) : ");
        person.tinggi = input.nextDouble() / 100;
        person.beratIdeal = HitungBeratBadanIdeal(person.berat, person.tinggi);
        System.out.println(String.format("%s %f", "Indeks Masa Tubuh anda sebesar : ", person.beratIdeal));
        System.out.println(String.format("%s %s", "Hasil menunjukkan bahwa anda ", Kategori(person.beratIdeal)));
    }
}
