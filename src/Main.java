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
        for (int friday=4;friday<32;friday=friday+7){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3
        System.out.println("Задание 3");
        int year = 2022;
        for (i=0;i<=year+100;i=i+79){
            if (i>year-200){
                System.out.println(i);
            }
        }

        //Задание 4
        System.out.println("Задание 4");
        for (int j=1;j<=30;j++){
            System.out.print(j+":");
            if (j%3==0){
                System.out.print(" ping");
            }
            if (j%5==0){
                System.out.print(" pong");
            }
            System.out.println();
        }

        //Задание 5
        System.out.println("Задание 5");
        int x1 = 0;
        int x2 = 1;
        int sum;
        System.out.print("Последовательность Фибоначчи: 0 1 ");
        for (int j=0;j<8;j++){
        sum=x1+x2;
        System.out.print(sum+" ");
        x1=x2;
        x2=sum;
    }
}
}