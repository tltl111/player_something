package Day2324252627;

public class passwordValidator {
    
        public boolean isPasswordValid(String password) {
        if (password.length() < 6 || password.length() > 13) {
                return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;

        for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                hasUppercase = true;
                } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
                } else if (Character.isDigit(ch)) {
                hasNumber = true;
                }

                if (hasUppercase && hasLowercase && hasNumber) {
                break;
                }
        }

        if (!hasUppercase || !hasLowercase || !hasNumber) {
                return false;
        }

        if (password.contains("T") || password.contains("&")) {
                return false;
        }

        return true;
        }

}
