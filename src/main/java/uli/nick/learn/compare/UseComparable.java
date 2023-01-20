package uli.nick.learn.compare;

import uli.nick.learn.auxiliary.Staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparable {

    public static void main(String[] args) {
        List<Staff> staff = new ArrayList<>(Staff.getStaff());
        staff.forEach(System.out::println);
        System.out.println("********************");
        Collections.sort(staff);
        staff.forEach(System.out::println);
        System.out.println("********************");
        Collections.sort(staff, new UComparator());
    }
}

class UComparator implements Comparator<Staff> {
    @Override
    public int compare(Staff o1, Staff o2) {
        return o1.compareTo(o2);
    }
}