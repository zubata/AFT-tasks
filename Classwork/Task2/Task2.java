package Classwork.Task2;

public class Task2 {
    public static void main(String[] args) {
        int monthnumber=9;
        System.out.println(method1(monthnumber));
        System.out.println(method2(monthnumber));
    }

    public static String method1 (int monthnumber) {
        if(monthnumber>=0&&monthnumber<13) {
            if(monthnumber<3||monthnumber==12) {
                return "Ещё зима";
            }
            else if (monthnumber<6) {
                return "Уже Весна(почти лето)";
            }
            else if (monthnumber<9) {
                return "Наконец Лето!";
            }
            else return "Опять Осень"; }
        else return "Неверное число";
    }

    public static String method2 (int monthnumber) {
        monthnumber = monthnumber%13;
        switch (monthnumber) {
            case 1:
                return "Ещё зима";
            case 2:
                return "Ещё зима";
            case 3:
                return "Уже Весна(почти лето)";
            case 4:
                return "Уже Весна(почти лето)";
            case 5:
                return "Уже Весна(почти лето)";
            case 6:
                return "Наконец Лето!";
            case 7:
                return "Наконец Лето!";
            case 8:
                return "Наконец Лето!";
            case 9:
                return "Опять Осень";
            case 10:
                return "Опять Осень";
            case 11:
                return "Опять Осень";
            case 12:
                return "Ещё зима";
                default:
                    return "Nope";
        }
    }
}
