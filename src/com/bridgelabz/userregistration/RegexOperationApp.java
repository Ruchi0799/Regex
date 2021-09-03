package com.bridgelabz.userregistration;

@FunctionalInterface
interface IMathFunction{
    boolean calculate(String value);
}

public class RegexOperationApp {

    public static void main(String[] args) {
        IMathFunction firstname=(value) -> {
            String regexFN="[A-Z][a-z]{2,}";
            if (value.matches(regexFN))
            {
                return true;
            }
            return false;
        };

        IMathFunction lastname=(value) -> {
            String regexFN="^[A-Z][a-z]{3,}";
            if (value.matches(regexFN))
            {
                return true;
            }
            return false;
        };

        IMathFunction email=(value) -> {
            String regexFN="^[A-Z]?[a-z]{2,}[.+_-]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2,})?$";
            if (value.matches(regexFN))
            {
                return true;
            }
            return false;
        };

        IMathFunction mobileno=(value) -> {
            String regexFN="^[0-9-]{1,}\\s[0-9]{10}$";
            if (value.matches(regexFN))
            {
                return true;
            }
            return false;
        };

        IMathFunction password=(value) -> {
            String regexFN="^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
            if (value.matches(regexFN))
            {
                return true;
            }
            return false;
        };


        System.out.println("Is firstname Valid: "+firstname.calculate("Ruchi"));
        System.out.println("Is firstname Valid: "+firstname.calculate("ruchi"));
        System.out.println("Is lastname Valid: "+lastname.calculate("Mandve"));
        System.out.println("Is lastname Valid: "+lastname.calculate("Man"));
        System.out.println("Is email Valid: "+email.calculate("ruchi@gmail.com"));
        System.out.println("Is email Valid: "+email.calculate("ruchigmail.com"));
        System.out.println("Is mobileNo Valid: "+mobileno.calculate("91 9292735509"));
        System.out.println("Is mobileNo Valid: "+mobileno.calculate("99292735509"));
        System.out.println("Is password Valid: "+password.calculate("Ruchi07#"));
        System.out.println("Is password Valid: "+password.calculate("Ruchii"));
    }





    }

