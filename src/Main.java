//1. Вывести фразу “съешь же ещё этих мягких французских булок, да выпей чаю". +
//2. Вывести числа 1 2 4 8 16 32 64 … 1024 включительно. +
//3. Вывести предыдущее задание в 2 системе счисления. +
//4. Вывести числа 0 1 3 7 15 31 63 … 2147483647 +
//5. Вывести предыдущее задание в 2 системе счисления. +
//6. Написать программу которая принимает три процента - делает из них один цвет и выводит. Например процент красного 20%,
//   процент зеленого 50%, процент синего 90%. Результат 337FE5. +
//7. Вывести все числа от 0 до 2000 которые делятся И на 3 И на 5. +
//8. Вывести все числа от 0 до 2000 которые делятся ИЛИ на 3 ИЛИ на 5 ИЛИ на оба. +
//9. Вывести все числа от 0 до 2000 которые делятся ИЛИ ТОЛЬКО на 3 ИЛИ ТОЛЬКО на 5. +
//10. Каких чисел из 3 предыдущих заданий больше? Можно ли прошлое задание решить быстрее? +
//11. Вывести английский алфавит циклом. +
//12. Вывести только гласные из английского алфавита. +
//13. Написать степенным литералом (double num = 1e20) числа 1_000_000_000, 1_000_000_000 + 7, 1_000, 0.000_005. +

public class Main {
    public static void main(String[] args) {
        System.out.println("1 task");
        System.out.println("съешь же ещё этих мягких французских булок, да выпей чаю");
        System.out.println("2 task");
        int n = 1024;
        for (int i = 1; i < n + 1; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("3 task");
        for (int i = 1; i < n + 1; i *= 2) {
            System.out.print(toBinaryString(i) + " ");
        }
        System.out.println(" ");
        System.out.println("4 task");
        for (int i = 0; i >= 0; i = i * 2 + 1) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("5 task");
        for (int i = 0; i >= 0; i = i * 2 + 1) {
            System.out.print(toBinaryString(i) + " ");
        }
        System.out.println(" ");
        System.out.println("6 task");
        int a = 20;
        int b = 50;
        int c = 90;
        System.out.println(toHex(a) + toHex(b) + toHex(c));
        System.out.println("7 task");
        int cnt = 0;
        for (int i = 0; i < 2001; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println(" ");
        System.out.println("8 task");
        int cnt1 = 0;
        for (int i = 0; i < 2001; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                cnt1++;
            }
        }
        System.out.println(" ");
        System.out.println("9 task");
        int cnt2 = 0;
        for (int i = 0; i < 2001; i++) {
            if (i % 15 != 0 && (i % 3 == 0 || i % 5 == 0)) {
                System.out.print(i + " ");
                cnt2++;
            }
        }
        System.out.println(" ");
        System.out.println("10 task");
        System.out.println(cnt + "\n" + cnt1 + "\n" + cnt2);
        System.out.println("11 task");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("12 task");
        for (char i = 'a'; i <= 'z'; ) {
            if ((i == 'a') || (i == 'e') || (i == 'i') || (i == 'o') || (i == 'u'))
                System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        System.out.println("13 task");
        double num = 1e9 + 7, num2 = 1e9, num3 = 1e3, num4 = 5e-6;
        System.out.printf("%.0f", num);
        System.out.println(" ");
        System.out.printf("%.0f", num2);
        System.out.println(" ");
        System.out.printf("%.0f", num3);
        System.out.println(" ");
        System.out.printf("%.6f", num4);
        System.out.println(" ");
        System.out.println(" ");
    }

    private static String toHex(int num) {
        int dec = ((num * 255) / 100) / 16;
        String dec1 = Integer.toString(dec);
        int ed1 = (((num * 255) / 100) - (dec * 16));
        String ed2 = Integer.toString(ed1);

        if (dec > 9) {
            for (char i = 'a'; i <= 'f'; i++) {
                int a = i - 'a' + 10;
                if (a == dec) {
                    dec1 = Character.toString(i);
                }
            }
        }

        if (ed1 > 9) {
            for (char i = 'a'; i <= 'f'; i++) {
                int a = i - 'a' + 10;
                if (a == ed1) {
                    ed2 = Character.toString(i);
                }
            }
        }
        return dec1 + ed2;
    }
    private static String toBinaryString(int numb) {
        return String.format("%32s", Integer.toBinaryString(numb)).replace(' ', '0');
    }
}