package dataencryption;


public class DataEncryption {

    public static String encrypt(String plaintext, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                int offset = (currentChar - base + shift) % 26;
                char encryptedChar = (char) (base + offset);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    public static void main(String[] args) {
        String plaintext = "Hello, World!";
        int shift = 3;

        String encryptedText = encrypt(plaintext, shift);

        System.out.println("Original: " + plaintext);
        System.out.println("Encrypted: " + encryptedText);
    }
}
