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
        String exampleWord = getString();

        int capsCount = 0;
        for (int i = 0; i < exampleWord.length(); i++){
            if (Character.isUpperCase(exampleWord.charAt(i))) {
                capsCount++;
            }
        }

        if(capsCount == exampleWord.length() || capsCount == 0)
            return true;
        if (capsCount == 1 && Character.isUpperCase(exampleWord.charAt(0)))
            return true;

        return false;
    }

}

