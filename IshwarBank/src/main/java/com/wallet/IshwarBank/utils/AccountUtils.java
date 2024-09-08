package com.wallet.IshwarBank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_NOT_EXISTS_CODE="003";
    public  static final String ACCOUNT_NOT_EXISTS_MESSAGE="User with provided Acocunt number does not exists!";

    public static final String ACCOUNT_CREATION_SUCCESS="002";
    public  static final String ACCOUNT_CREATION_MESSAGE="Account has been Successfully created!";

    public static final String ACCOUNT_EXISTS_CODE="001";
    public  static final String ACCOUNT_EXISTS_MESSAGE="This User already has Account created!";

    public static final String ACCOUNT_FOUND_CODE="004";
    public  static final String ACCOUNT_FOUND_MESSAGE="Successful ! User Account Exists";

    public static final String ACCOUNT_CREDITED_SUCCESS="005";
    public  static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE="Successful ! Entered Amount is Successfully Credited";

    public static final String INSUFFICIENT_BALANCE_CODE="006";
    public  static final String INSUFFICIENT_BALANCE_CODE_MESSAGE ="OOPS ! INSUFFICIENT BALANCE";

    public static final String ACCOUNT_DEBITED_SUCCESS="007";
    public  static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE="Successful ! Entered Amount is Successfully debited";

    public static final String TRANSFER_SUCCESSFUL_CODE="008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE="Transaction Successful";


    public static String generateAccountNumber(){
        Year currentYear=Year.now();
        int min=100000;
        int max=999999;

        int randNumber=(int) Math.floor(Math.random() * (max-min+1)+min);

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber=new StringBuilder();
       return accountNumber.append(year).append(randomNumber).toString();

    }
 }
