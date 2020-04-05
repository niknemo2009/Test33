public class Human {
    int age;
    String name;
    {
        System.out.println("Ініціалізатор 1");
    }

    public Human(int age, String name) {
        this.age = 33;
        this.name = name;
        // test message
    }

    public Human() {

    }

    void live(){
        System.out.println("Працює метод live()");
    }


    public static void main(String[] args) {
        byte varByte=-12;
        short varShort=234;
        int varInt=12345;
        long varLong=34343434;

        char varChar=134;

        float varFloat =12.23f;
        double varDouble=23.45;

        boolean varBool=true;

        System.out.println(Long.MAX_VALUE);
        int var33=051;//5*8+1
        int var51=0x12353f;//16*16*5+16*3+1*1// 1280+48+1// 1329//0-9 a-10 b-11c de f-15
        System.out.println(var51);

    }

}
