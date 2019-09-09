public class Encrypt {

    public String EncryptPlainText(String plainText, int key){
        String cipherText= "";
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String text= plainText.toLowerCase();

        for(int i=0; i<text.length(); i++){
            int indexOfLetter= alphabet.indexOf(text.charAt(i));
            int indexOfEncryptedVal= (indexOfLetter + key) %26;
            char encryptedLetter= alphabet.charAt(indexOfEncryptedVal);
            cipherText+= encryptedLetter;


        }
        return cipherText;
    }

}
