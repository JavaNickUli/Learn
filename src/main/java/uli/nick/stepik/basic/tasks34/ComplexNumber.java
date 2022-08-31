package uli.nick.stepik.basic.tasks34;

import java.util.Objects;

/**
 * <p>Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал
 * экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().
 * <p>Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 */

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
