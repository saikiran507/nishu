public class ByteHex {

    public static void main(String[] args) {

        byte[] bytes = {120,10,10,20}

        for (byte b : bytes) {
            String st = String.format("%02X", b);
            System.out.print(st);
        }
    }
}
