package ca.bcit.comp2522.bank;

/**
 * Represents a name with first and last name.
 * This class validates and formats names according to specific rules.
 * It also contains methods to get the person's initials, their
 * full name, and their name in reverse.
 *
 * @author Daniel Chopty
 * @version 1.0
 */
public class Name {

    private final String firstName;
    private final String lastName;

    /**
     * Maximum allowed length for names.
     */
    public static final int NAME_MAX_LENGTH = 45;

    /**
     * First initial of either first or last name.
     */
    public static final int FIRST_INITIAL = 0;

    /**
     * Represents the rest of the word, used for substring.
     */
    public static final int REST_OF_WORD = 1;

    /**
     * Reserved word that should not be used in any name (case insensitive).
     */
    public static final String INVALID_WORD = "admin";

    /**
     * Constructs a Name object with the specified first and last name.
     *
     * @param firstName the first name
     * @param lastName the last name
     * @throws IllegalArgumentException if the first name or last name is null, blank, exceeds the max length,
     * or contains the invalid word "admin" (case insensitive).
     */
    public Name(final String firstName,
                final String lastName)
    {
        validateName(firstName);
        validateName(lastName);

        this.firstName = firstName;
        this.lastName =  lastName;
    }
    /**
     * Validates the provided name.
     * The name is considered invalid if it is null, blank, exceeds the maximum length, or contains the invalid word.
     *
     * @param name the name to be validated
     * @throws IllegalArgumentException if the name is invalid
     */
    private static void validateName(final String name)
    {
        if (name == null || name.isBlank() ||
                name.length() > NAME_MAX_LENGTH ||
                name.equalsIgnoreCase(INVALID_WORD))
        {
            throw new IllegalArgumentException("Bad name: " + name);
        }
    }

    /**
     * Returns the first name.
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Returns the last name.
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

/**
 * Returns the initials of the first and last name.
 * The initials are returned in uppercase followed by a period (e.g., "J.D.").
 *
 *
 * @return the initials of the first and last name
 */
public String getInitials()
{
    final StringBuilder initials = new StringBuilder();
    initials.append(firstName.charAt(FIRST_INITIAL));
    initials.append(".");
    initials.append(lastName.charAt(FIRST_INITIAL));
    initials.append(".");
    return initials.toString();
}
    /**
     * Returns the full name with the first and last name properly capitalized.
     * The first letter of each name is capitalized, and the remaining letters are in
     lowercase.
     *
     * @return the full name with proper capitalization
     */
    public String getFullName() {
        final StringBuilder fullName;
        fullName = new StringBuilder();
        fullName.append(Character.toUpperCase(firstName.charAt(FIRST_INITIAL)));
        fullName.append(firstName.substring(REST_OF_WORD).toLowerCase());
        fullName.append(" ");
        fullName.append(Character.toUpperCase(lastName.charAt(FIRST_INITIAL)));
        fullName.append(lastName.substring(REST_OF_WORD).toLowerCase());
        return fullName.toString();
    }
    /**
     * Returns the reverse of the first name.
     * The first name is reversed character by character.
     *
     * @return the reversed first name
     */
    public String getReverseName()
    {
        final StringBuilder reversedName;
        reversedName = new StringBuilder();
        reversedName.append(getFullName()).reverse();
        return reversedName.toString();
    }
}