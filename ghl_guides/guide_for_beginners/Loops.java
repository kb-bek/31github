package ghl_guide;

public class Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        int count = 1;

        while (count < 10){
            if (count % 2 != 0) {
                System.out.println(count);
            }

            count += 1;
        }

        int j = 1;
        do {
            System.out.println(j);
            j *= 2;
        }while (j < 30);

    }

}
