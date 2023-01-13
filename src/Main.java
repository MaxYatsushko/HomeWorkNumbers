public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){

        byte varByte = 127;
        int varInt = 127000;
        short varShort = 12700;
        long varLong = 1270000000;
        float varFloat = 1224.3F;
        double varDouble = 12222222222.2121;

        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
    }

}