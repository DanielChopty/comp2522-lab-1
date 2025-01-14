package ca.bcit.comp2522.bank;
/**
 * Represents a bank client, including personal details and signup date.
 *
 * @author Daniel Chopty
 * @version 1.0
 */
public class BankClient
{
    /**
     * Represents an externally sourced name from the Name class.
     */
    private final Name name;
    /**
     * Represents an externally sourced birthday.
     */
    private final Date birthDate;
    /**
     * Represents an externally sourced date of death.
     */
    private final Date deathDate;
    /**
     * Represents an externally sourced bank signup date.
     */
    private final Date signupDate;
    /**
     * Represents an externally sourced client ID.
     */
    private final String clientID;
    /**
     * Represents the minimum acceptable client ID length.
     */
    public static final int CLIENT_ID_MIN = 6;
    /**
     * Represents the maximum acceptable client ID length.
     */
    public static final int CLIENT_ID_MAX = 7;
    /**
     * Constructs a new BankClient object with the specified details.
     *
     * @param name the name of the client
     * @param birthDate the birth date of the client
     * @param deathDate the death date of the client (null if the client is alive)
     * @param signupDate the signup date of the client
     * @param clientID the unique client ID
     * @throws IllegalArgumentException if the client ID does not meet the required
    length
     */
    public BankClient(final Name name,
                      final Date birthDate,
                      final Date deathDate,
                      final Date signupDate,
                      final String clientID)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.signupDate = signupDate;
        this.clientID = clientID;
        validateClientID(clientID);
    }
    /**
     * Validates the client ID to ensure it is either 6 or 7 characters long.
     *
     * @param clientID the client ID to validate
     * @throws IllegalArgumentException if the client ID length is not valid
     */
    private static void validateClientID(final String clientID)
    {
        if (clientID.length() != CLIENT_ID_MIN && clientID.length() != CLIENT_ID_MAX)
        {
            throw new IllegalArgumentException("Bad client ID");
        }
    }
    /**
     * Returns a string representation of the client's details, including name, client
     ID,
     * status (alive or deceased), birth date, and signup date.
     *
     * @return a string containing the client's details
     */
    public String getDetails()
    {
        StringBuilder details;
        details = new StringBuilder();
        details.append(name.getFullName());
        details.append(" client #").append(clientID);
        if (deathDate == null)
        {
            details.append(" (alive) joined the bank on ");
            details.append(signupDate.getDayOfWeek().toLowerCase());
            details.append(", ");
            details.append(signupDate.getLongDate());
        }
        else
        {
            details.append(" (not alive) joined the bank on ");
            details.append(signupDate.getDayOfWeek().toLowerCase());
            details.append(", ");
            details.append(signupDate.getLongDate());
        }
        details.append("\n");
        details.append(name.getFullName());
        if (deathDate == null)
        {
            details.append(" (alive) was born on ");
            details.append(birthDate.getDayOfWeek().toLowerCase());
            details.append(", ");
            details.append(birthDate.getLongDate());
            details.append("!");
        }
        else
        {
            details.append(" (died ");
            details.append(deathDate.getDayOfWeek().toLowerCase());
            details.append(", ");
            details.append(deathDate.getLongDate());
            details.append(")");
            details.append(" was born on ");
            details.append(birthDate.getDayOfWeek().toLowerCase());
            details.append(", ");
            details.append(birthDate.getLongDate());
            details.append("!");
        }
        return details.toString();
    }
}