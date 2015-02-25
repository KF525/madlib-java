import java.util.ArrayList;

/**
 * Created by katefulton on 2/24/15.
 */
public class MadLibs {

    public static void main(String[] args) {
        ArrayList<String> libs = new ArrayList<String>();
        libs.add("Ishmael");
        libs.add("money");
        libs.add("purse");
        libs.add("shore");
        libs.add("sail");
        libs.add("see");
        System.out.print("Call me " + libs.get(0)); //noun
        System.out.print(" Some years ago - never mind how long precisely - having little or no " + libs.get(1)); //noun
        System.out.print(" in my " + libs.get(2)); //noun
        System.out.print(" and nothing particular to interest me on " + libs.get(3)); //noun
        System.out.print(" I thought I would " + libs.get(4)); //verb
        System.out.print(" about a little and " + libs.get(5)); //verb
        System.out.print(" the watery part of the world.");
    }
}
