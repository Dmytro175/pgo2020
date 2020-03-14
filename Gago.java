import java.util.Scanner;
public class Gago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj login");
        String login = scanner.next();

        System.out.println("Podaj hasło");
        String hasło = scanner.next();

        if (login.equalsIgnoreCase("admin") && hasło.equals("as"))
        {  System.out.println("Logowanie jako admin");}
        else
        {
            if (login.equals("guest"))
            {
                System.out.println("Logowanie jako gość");
            }
            else
            {
                System.out.println("Nieprawiedłowo");
            }
        }}
}
