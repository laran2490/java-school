package ru.mivr.third;

import java.util.Scanner;

/**
 * Изучаем ввод с консоли
 */
public class SystemInLesson {
    public static void main(String[] args) {
        /*try {
            int read = System.in.read();
            System.out.println((char) read);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try {
            byte[] bytes = new byte[12];
            System.in.read(bytes, 0, bytes.length);
            char[] chars = new char[12];

            for (int i = 0; i < bytes.length; i++) {
                chars[i] = (char) bytes[i];
//                System.out.print((char) bytes[i]);
            }

            String name = String.valueOf(chars);
            System.out.println(name);
//            System.out.println(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Scanner scanner = new Scanner(System.in);
        scanner.close();
        while (true) {
            String s = scanner.nextLine();
            System.out.println(s);
            if (scanner.hasNext("q")) {
                break;
            }
        }

        /*String readString;
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            readString = br.readLine();
            System.out.println("readString: " + readString);
            in.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br == null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}
