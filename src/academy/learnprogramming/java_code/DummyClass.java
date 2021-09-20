package academy.learnprogramming.java_code;

public class DummyClass {

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public void printNumbers(int[] numbers){
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void printChars(char[] chars) {
        for(char c : chars) {
            System.out.print(c);
        }
    }
}
