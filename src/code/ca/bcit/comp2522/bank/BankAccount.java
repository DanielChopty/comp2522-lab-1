package ca.bcit.comp2522.bank;
import java.text.DecimalFormat;
/**
 * Represents a bank account linked to a bank client.
 *
 * @author Daniel Chopty
 * @version 1.0
 */
public class BankAccount
{
    /**
     * Represents an externally sourced account number.
     */
    private final String accountNumber;
    /**
     * Represents an externally sourced balance.
     */
    private double balance;
    /**
     * Represents an externally sourced account opening date.
     */
    private final Date accountOpened;
    /**
     * Represents an externally sourced account closing date.
     */
    private final Date accountClosed;
    /**
     * Represents an externally sourced client from the BankClient class.
     */
    private final BankClient client;
    /**
     * Represents the minimum length for the account number.
     */
    public static final int ACCOUNT_NUM_MIN = 6;
    /**
     * Represents the maximum length for the account number.
     */
    public static final int ACCOUNT_NUM_MAX = 7;
    /**
     * Represents the minimum pin possible (pin cannot be negative).
     */
    public static final int PIN_MIN = 0;
    /**
     * Represents the minimum withdrawal amount possible (cannot withdraw negative
     money).
     */
    public static final int WITHDRAW_MIN = 0;
/**
 * Constructs a new BankAccount object with the specified account number, balance,
 * account opened and closed dates, and associated bank client.
 *
 * @param accountNumber the account number
 * @param balance the current balance of the account
 * @param accountOpened the date the account was opened
 * @param accountClosed the date the account was closed (null if the account is still
open)
 * @param client the client associated with this account
 * @throws IllegalArgumentException if the account number is not valid
 */
public BankAccount(final String accountNumber,
                   final double balance,
                   final Date accountOpened,
                   final Date accountClosed,
                   final BankClient client)
{
    this.balance =       balance;
    this.accountNumber = accountNumber;
    this.accountOpened = accountOpened;
    this.accountClosed = accountClosed;
    this.client =        client;
    validateAccountNumber(accountNumber);
}
    /**
     * Validates the account number to ensure it is either 6 or 7 characters long.
     *
     * @param accountNumber the account number to validate
     * @throws IllegalArgumentException if the account number length is not valid
     */
    private static void validateAccountNumber(final String accountNumber)
    {
        if (accountNumber.length() != ACCOUNT_NUM_MIN && accountNumber.length() !=
                ACCOUNT_NUM_MAX) {
            throw new IllegalArgumentException("Bad account number");
        }
    }
    /**
     * Returns the current balance of the account.
     *
     * @return the current balance in the account
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * Withdraws a specified amount from the account balance.
     *
     * @param amountUsd the amount to withdraw in USD
     */
    public void withdraw(final double amountUsd)
    {
        balance -= amountUsd;
    }
    /**
     * Withdraws a specified amount from the account balance with a PIN check.
     *
     * @param amountUsd the amount to withdraw in USD
     * @param pinToMatch the PIN to match for withdrawal (currently not used)
     */
    public void withdraw(final double amountUsd, final int pinToMatch)
    {
        if (amountUsd <= WITHDRAW_MIN || amountUsd > balance)
        {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }
        else if (pinToMatch < PIN_MIN)
        {
            throw new IllegalArgumentException("Invalid pin to match.");
        }
        withdraw(amountUsd);
    }
    /**
     * Returns a string representation of the account details, including the balance,
     * account number, account opening date, and account closing date (if applicable).
     *
     * @return a string containing the account's details
     */
    public String getDetails()
    {
        DecimalFormat df;
        df = new DecimalFormat("#");
        StringBuilder details;
        details = new StringBuilder();
        details.append(" had $").append(df.format(balance)).append(" USD in account #").append(accountNumber);
        details.append(" which he opened on ").append(accountOpened.getDayOfWeek());
        details.append(", ").append(accountOpened.getLongDate());
        if (accountClosed != null)
        {
            details.append(" and closed ").append(accountClosed.getDayOfWeek());
            details.append(", ").append(accountClosed.getLongDate());
        }
        return details.toString();
    }
}