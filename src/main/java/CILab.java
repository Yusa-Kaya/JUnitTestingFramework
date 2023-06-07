public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString == null) {
            throw new IllegalArgumentException("The string cannot be null!");
        }else if(myString.length() == 0){
            return false;
        }

        if(myString.equals(myString.toUpperCase())){
            return true;
        }else if(myString.equals(myString.toLowerCase())){
            return true;
        }else{
            // Check if the first character is uppercase
            if (!Character.isUpperCase(myString.charAt(0))) {
                return false;
            }

            // Check if the remaining characters are lowercase
            for (int i = 1; i < myString.length(); i++) {
                if (!Character.isLowerCase(myString.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        CILab x = new CILab();
        System.out.println(x.detectCapitalUse());
    }
}

