package uli.nick.learn.mindfuck;

public class NullPointer {

    public static void main(String[] args) {
        try {
            Exception ex = null;
            throw ex;
        } catch (NullPointerException npe) {
            System.out.println("Catch NullPointerException");
            System.out.println(npe == null);
        } catch (Exception e) {
            System.out.println("Catch Exception");
            System.out.println(e == null);
        }
    }
}
