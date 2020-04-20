package Advance.RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberREGEX {
    public void phoneNumberValidator()
{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Phone Number Starting with +254");
        String phoneNumber =scan.nextLine();
        String str=  "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?";


        if (Pattern.compile(str).matcher(phoneNumber).matches()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}