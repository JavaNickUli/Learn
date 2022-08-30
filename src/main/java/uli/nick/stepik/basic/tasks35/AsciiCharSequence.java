package uli.nick.stepik.basic.tasks35;

public class AsciiCharSequence implements CharSequence{

    private byte[] ascii;

    public AsciiCharSequence(byte[] array) {
        this.ascii = array;
    }

    @Override
    public int length() {
        return ascii.length;
    }

    @Override
    public char charAt(int index) {
        return (char) ascii[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subArray = new byte[end - start];
        for (int i = start, j = 0; i < end; i++) {
            subArray[j++] = ascii[i];
        }
        return new AsciiCharSequence(subArray);
    }

    @Override
    public String toString() {
        return new String(ascii);
    }
}
