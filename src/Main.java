public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int i=1;
        while(i<11){
            System.out.print(i+" ");
            i++;
        }
        i--;
        System.out.println();
        for(; i>0; i--){
            System.out.print(i+" ");
        }

        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int Friday=4;
        for (;Friday<32;Friday=Friday+7){
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3
        System.out.println("Задание 3");
        int day = 2022;
        for (i=0;i<=day+100;i=i+79){
            if (i>day-200){
                System.out.println(i);
            }
        }
    }
}