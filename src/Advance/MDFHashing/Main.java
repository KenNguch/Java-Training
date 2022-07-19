package Advance.MDFHashing;

import static java.nio.charset.StandardCharsets.UTF_8;


public class Main {

    public static void main(String[] args) {
        try {

            String OUTPUT_FORMAT = "%-30s:%s";
            String PASSWORD = "this is a password";
            String pText = "EncryptorAesGcm-GSM Password-Bases encryption!";

            String encryptedTextBase64 = EncryptorAesGcmPassword.encrypt(pText.getBytes(UTF_8), PASSWORD);

            System.out.println("\n------ EncryptorAesGcm GCM Password-based Encryption ------");
            System.out.println(String.format(OUTPUT_FORMAT, "Input (plain text)", pText));
            System.out.println(String.format(OUTPUT_FORMAT, "Encrypted (base64) ", encryptedTextBase64));

            System.out.println("\n------ EncryptorAesGcm GCM Password-based Decryption ------");
            System.out.println(String.format(OUTPUT_FORMAT, "Input (base64)", encryptedTextBase64));

            String decryptedText = EncryptorAesGcmPassword.decrypt(encryptedTextBase64, PASSWORD);
            System.out.println(String.format(OUTPUT_FORMAT, "Decrypted (plain text)", decryptedText));

        } catch (Exception ignored) {
        }
    }
}
