class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasValidLength = false;
        boolean hasNoAdjacentSame = true;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // 1. Length condition check (Kam se kam 8)
            if (password.length() >= 8) {
                hasValidLength = true;
            }

            // 2. Adjacent character check (Padosi same nahi hona chahiye)
            if (i > 0 && ch == password.charAt(i - 1)) {
                hasNoAdjacentSame = false;
            }
            // 3. Lowercase check
            else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            }
            // 4. Uppercase check
            else if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            }
            // 5. Digit check
            else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
            // 6. Special character check (Aapki tarah exact single quotes '')
            else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || 
                     ch == '%' || ch == '^' || ch == '&' || ch == '*' || 
                     ch == '(' || ch == ')' || ch == '-' || ch == '+') {
                hasSpecial = true;
            }
        }

        // Saari 6 conditions sahi honi chahiye tabhi return true hoga
        return hasValidLength && hasNoAdjacentSame && hasLower && hasUpper && hasDigit && hasSpecial;
    }
}

/*
class Solution {
    public boolean strongPasswordCheckerII(String password) {

        if(password.length() < 8){return false ;}

        boolean lower = false ;
        boolean upper = false ;
        boolean digit = false ;
        boolean special = false ;

        for(int i =0 ; i < password.length() ; i++){
            char ch = password.charAt(i);

            if( ch >= 'a' && ch <= 'z'){
                lower = true;
            }
            else if( ch >= 'A' && ch <= 'Z'){
                upper = true;
            }
            else if( ch >= '0' && ch <= '9'){
                digit = true;
            }
            else if( "!@#$%^&*()-+".indexOf(ch) != -1){
                special = true;
            }

        }

        if(lower == true && upper == true && digit == true && special == true ){
            return true;
        }
        return false ;
    }
}

*/