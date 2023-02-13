package uli.nick.learn.mindfuck;

import java.io.IOException;

public class ExceptionNull {

    public static void main(String[] args) {
        try {
            Exception ex = null;
            throw ex;
        } catch (IOException ioe) {
            System.out.println("Catch IOException");
        } catch (IllegalStateException ise) {
            System.out.println("Catch IllegalStateException");
        } catch (NullPointerException npe) {
            System.out.println("Catch NullPointerException");
        } catch (Exception e) {
            System.out.println("Catch Exception");
        }
    }
}
