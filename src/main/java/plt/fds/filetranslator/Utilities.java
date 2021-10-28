package plt.fds.filetranslator;

public class Utilities {

    public static String LeftJustify(String s, int n)
    {
        return String.format("%-"+ n + "." + n + "s", s);
    }

}
