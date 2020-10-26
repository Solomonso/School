/**
 * The StringHelper class converts any given string to url format.
 */
public class StringHelper {
    public static String http = "http://";
    public static final int  MAX_GRADE = 10;

    /**
     *  This method transform strings into url
     * @param s accepts string
     * @return returns a string as url
     */
    public static String makeStringUrl(String s)  {
        String result = http + s.toLowerCase().replaceAll("\\W","");
        return result;
    }
}
