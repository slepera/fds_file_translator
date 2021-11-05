package plt.fds.filetranslator;

import plt.fds.filetranslator.exceptions.OutOfRangeException;

import java.math.BigDecimal;

public class Utilities {
    /*
    range control over values
     */

    public static String LeftJustify(String s, int n) throws OutOfRangeException {

        if (s.length() > n) {
            throw new OutOfRangeException("String " + s + " is longer than the maximum allowed range " + n );
        } else {
            return String.format("%-" + n + "." + n + "s", s);
        }

    }

    public static String LeftJustify(Double f, int n) throws OutOfRangeException {
        String tmp = BigDecimal.valueOf(f).toString();

        if (tmp.length() > n) {
            throw new OutOfRangeException("String " + tmp + " is longer than the maximum allowed range " + n );
        } else {
            return String.format("%-" + n + "." + n + "s", tmp);
        }

    }

    public static String LeftJustify(Integer d, int n) throws OutOfRangeException {
        String tmp = BigDecimal.valueOf(d).toString();

        if (tmp.length() > n) {
            throw new OutOfRangeException("String " + tmp + " is longer than the maximum allowed range " + n );
        } else {
            return String.format("%-" + n + "." + n + "s", tmp);
        }

    }

    public static String RightJustify(String s, int n) {
        return String.format("%" + n + "." + n + "s", s);
    }



}

