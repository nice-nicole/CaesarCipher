public class Decrypt {

    public String DecrptCipherText(String cipherText, int key){
        String plainText= "";
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String text= cipherText.toLowerCase();
        Encrypt encrypt= new Encrypt();
        String cipherr= encrypt.EncryptPlainText(cipherText, key);

        for(int i=0; i<cipherr.length(); i++){
            int indexOfLetter= alphabet.indexOf(cipherr.charAt(i));
            int indexOfDecryptedVal= (indexOfLetter - key) %26;
            char decryptedLetter= alphabet.charAt(indexOfDecryptedVal);
            plainText+=decryptedLetter;

//            int indexOfLetter= alphabet.indexOf(text.charAt(i));
//            int indexOfEncryptedVal= (indexOfLetter + key) %26;
//            char encryptedLetter= alphabet.charAt(indexOfEncryptedVal);
//            cipherText+= encryptedLetter;
        }
        return plainText;
    }

}
