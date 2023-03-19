import java.util.Scanner;

public class Main {
    static Punkt tillPunkt(RPunkt rPunkt) {
        Punkt p = new Punkt();
        p.x = rPunkt.r * Math.cos(rPunkt.teta);
        p.y = rPunkt.r * Math.sin(rPunkt.teta);

        return p;
    }

    public static void main(String[] args) {
        // Skriv en metod (tillPunkt) som omvandlar en polär koordinat till en rektangulär koordinat.
        //
        // Punkt = Klass för att representera en punkt mha. rektangulära koordinater
        // RPunkt = Klass för att representera en punk mha. polära koordinater
        //
        // x = r * cos(θ)
        // y = r * sin(θ)

        Scanner input = new Scanner(System.in);
        System.out.println("Ange en polär koordinat (r teta)");
        RPunkt rp = new RPunkt();
        rp.r = input.nextDouble();
        rp.teta = input.nextDouble();

        Punkt p = tillPunkt(rp);

        System.out.format("%.2f, %.2f", p.x, p.y);
    }
}

class Punkt {
    double x;
    double y;
}

class RPunkt {
    double r;
    double teta;
}