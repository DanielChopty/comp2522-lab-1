package ca.bcit.comp2522.bank;
/**
 * Main class to test the BankClient, BankAccount, and associated classes.
 */
public class Main
{
    public static void main(String[] args)
    {
        // Declare objects for Albert Einstein
        Name einsteinName;
        Date einsteinBirthDate, einsteinDeathDate, einsteinSignupDate, einsteinAccountOpened, einsteinAccountClosed;
        BankClient einstein;
        BankAccount einsteinAccount;

        // 1. Albert Einstein (March 14, 1879 – April 18, 1955)
        einsteinName = new Name("Albert", "Einstein");
        einsteinBirthDate = new Date(1879, 3, 14);
        einsteinDeathDate = new Date(1955, 4, 18);
        einsteinSignupDate = new Date(1900, 1, 1);
        einsteinAccountOpened = new Date(1900, 1, 1);
        einsteinAccountClosed = new Date(1950, 10, 14);
        einstein = new BankClient(einsteinName, einsteinBirthDate, einsteinDeathDate, einsteinSignupDate, "abc123");
        einsteinAccount = new BankAccount("abc123", 1000.0, einsteinAccountOpened, einsteinAccountClosed, einstein);

        // Printing details for Albert Einstein
        System.out.println(einsteinName.getInitials());
        System.out.println(einsteinName.getFullName());
        System.out.println(einsteinName.getReverseName());
        System.out.println(einstein.getDetails());

        // Printing account details for Albert Einstein before withdrawal
        System.out.println(einsteinName.getFullName() + einsteinAccount.getDetails());

        // Simulate withdrawal for Albert Einstein (pin 3141)
        einsteinAccount.withdraw(100, 3141);
        System.out.println("New balance after withdrawal: $" + String.format("%.0f", einsteinAccount.getBalance()) + "\n");

        // Declare objects for Nelson Mandela
        Name mandelaName;
        Date mandelaBirthDate, mandelaDeathDate, mandelaSignupDate, mandelaAccountOpened, mandelaAccountClosed;
        BankClient mandela;
        BankAccount mandelaAccount;

        // 2. Nelson Mandela (July 18, 1918 – December 5, 2013)
        mandelaName = new Name("Nelson", "Mandela");
        mandelaBirthDate = new Date(1918, 7, 18);
        mandelaDeathDate = new Date(2013, 12, 5);
        mandelaSignupDate = new Date(1994, 5, 10);
        mandelaAccountOpened = new Date(1994, 5, 10);
        mandelaAccountClosed = null; // still open
        mandela = new BankClient(mandelaName, mandelaBirthDate, mandelaDeathDate, mandelaSignupDate, "654321");
        mandelaAccount = new BankAccount("654321", 2000.0, mandelaAccountOpened, mandelaAccountClosed, mandela);

        // Printing details for Nelson Mandela
        System.out.println(mandelaName.getInitials());
        System.out.println(mandelaName.getFullName());
        System.out.println(mandelaName.getReverseName());
        System.out.println(mandela.getDetails());

        // Printing account details for Nelson Mandela before withdrawal
        System.out.println(mandelaName.getFullName() + mandelaAccount.getDetails());

        // Simulate withdrawal for Nelson Mandela (pin 4664)
        mandelaAccount.withdraw(200, 4664);
        System.out.println("New balance after withdrawal: $" + String.format("%.0f", mandelaAccount.getBalance()) + "\n");

        // Declare objects for Frida Kahlo
        Name kahloName;
        Date kahloBirthDate, kahloDeathDate, kahloSignupDate, kahloAccountOpened, kahloAccountClosed;
        BankClient kahlo;
        BankAccount kahloAccount;

        // 3. Frida Kahlo (July 6, 1907 – July 13, 1954)
        kahloName = new Name("Frida", "Kahlo");
        kahloBirthDate = new Date(1907, 7, 6);
        kahloDeathDate = new Date(1954, 7, 13);
        kahloSignupDate = new Date(1940, 1, 1);
        kahloAccountOpened = new Date(1940, 1, 1);
        kahloAccountClosed = new Date(1954, 7, 13);
        kahlo = new BankClient(kahloName, kahloBirthDate, kahloDeathDate, kahloSignupDate, "frd123");
        kahloAccount = new BankAccount("frd123", 500.0, kahloAccountOpened, kahloAccountClosed, kahlo);

        // Printing details for Frida Kahlo
        System.out.println(kahloName.getInitials());
        System.out.println(kahloName.getFullName());
        System.out.println(kahloName.getReverseName());
        System.out.println(kahlo.getDetails());

        // Printing account details for Frida Kahlo before withdrawal
        System.out.println(kahloName.getFullName() + kahloAccount.getDetails());

        // Simulate withdrawal for Frida Kahlo (pin 1907)
        kahloAccount.withdraw(50, 1907);
        System.out.println("New balance after withdrawal: $" + String.format("%.0f", kahloAccount.getBalance()) + "\n");

        // Declare objects for Jackie Chan
        Name chanName;
        Date chanBirthDate, chanDeathDate, chanSignupDate, chanAccountOpened, chanAccountClosed;
        BankClient chan;
        BankAccount chanAccount;

        // 4. Jackie Chan (April 7, 1954 – still alive)
        chanName = new Name("Jackie", "Chan");
        chanBirthDate = new Date(1954, 4, 7);
        chanDeathDate = null; // still alive
        chanSignupDate = new Date(1980, 10, 1);
        chanAccountOpened = new Date(1980, 10, 1);
        chanAccountClosed = null; // still open
        chan = new BankClient(chanName, chanBirthDate, chanDeathDate, chanSignupDate, "chan789");
        chanAccount = new BankAccount("chan789", 3000.0, chanAccountOpened, chanAccountClosed, chan);

        // Printing details for Jackie Chan
        System.out.println(chanName.getInitials());
        System.out.println(chanName.getFullName());
        System.out.println(chanName.getReverseName());
        System.out.println(chan.getDetails());

        // Printing account details for Jackie Chan before withdrawal
        System.out.println(chanName.getFullName() + chanAccount.getDetails());

        // Simulate withdrawal for Jackie Chan (pin 1954)
        chanAccount.withdraw(500, 1954);
        System.out.println("New balance after withdrawal: $" + String.format("%.0f", chanAccount.getBalance()));
    }
}
