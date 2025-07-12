package designPattern.B_Builder;

public class StudentValidator {
    private int id;
    private String name;
    private double psp;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private String phoneNumber;


    public static boolean validate (StudentHelper studentHelper) {
        return validateAge(studentHelper.getAge()) &&
                validateName(studentHelper.getName()) &&
                validateGradYear(studentHelper.getGradYear()) &&
                validatePhoneNumber(studentHelper.getPhoneNumber());
    }

    private static boolean validateAge(int age) {
        if(age < 18) return false;
        else return true;
    }

    private static boolean validateGradYear(int gradYear) {
        if(gradYear < 2025) return false;
        else return true;
    }

    private static boolean validateName(String name) {
        return (name != null && !name.isEmpty());
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        return !phoneNumber.isEmpty() && phoneNumber.length() == 10;
    }

}
