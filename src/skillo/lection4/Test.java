package skillo.lection4;

public class Test {
    public static void main(String[] args){
        moduleDivisions();
    }

    public static void moduleDivisions() {
        int num1 = 100;
        int num2 = 200;
        int divisionInt = num1 / num2;
        int divisionModule = num1 % num2;

        System.out.println(divisionInt + " and " + divisionModule);
    }

    public static void demoIfStatement() {
        int num = 70;
        if (num < 100) {
            System.out.println("number is less than 100");
        }
    }

    public static void demoNestedIfStatement() {
        int num = 70;
        if (num < 100) {
            System.out.println("number is less than 100");
            if (num > 50) {
                System.out.println("number is greater than 50");
            }
        }
    }

    public static void demoIfElseStatement() {
        int num = 120;
        if (num < 50) {
            System.out.println("num is less than 50");
        } else {
            System.out.println("num is greater than or equal 50");
        }
    }

    public static void demoIfElseIfStatement() {
        int num = 1234;
        if (num < 100 && num >= 10) {
            System.out.println("Its a two digit number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("Its a three digit number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("Its a four digit number");
        } else {
            System.out.println("number is not between 1 & 99999");
        }
    }

    public static void demoSwitchStatement() {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("Case1 ");
                break;
            case 2:
                System.out.println("Case2 ");
                break;
            case 3:
                System.out.println("Case3 ");
                break;
            default:
                System.out.println("Default ");
        }
    }
}
