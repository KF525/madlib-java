import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by katefulton on 2/24/15.
 */
public class MadLibs {

    public static void main(String[] args) {
        ArrayList<String> libs = new ArrayList<String>();
        ArrayList<String> mads = new ArrayList<String>();
        String[] strings = {
                "Call me ",
                " Some years ago - never mind how long precisely - having little or no ",
                " in my ",
                " and nothing particular to interest me on ",
                " I thought I would ",
                " about a little and ",
                " the watery part of the world."};
        mads.addAll(Arrays.asList(strings)); //asList??

        String s;
        Scanner in = new Scanner(System.in);
        String[] inputs = {"proper noun", "noun", "noun", "noun", "verb", "verb" };

        for (int i = 0; i < inputs.length; i++ ) {
            System.out.println("Choose a " + inputs[i]);
            s = in.nextLine();
            libs.add(s);
        }

        for (int i = 0; i < libs.size(); i++) {
            System.out.print(mads.get(i) + libs.get(i));
        }
        System.out.print(mads.get(6));

    }
}
