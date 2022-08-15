package uli.nick.job4j.lessons.tracker.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <p>4. Аттестация [#504878]
 * <p>В этом задании необходимо реализовать класс для подсчета статистики по аттестатам учеников.
 * <p>Класс Subject описывает школьный предмет и аттестационный балл ученика.
 * <p>Класс Pupil описывает ученика.
 * <p>Класс Label содержит результаты: имя и баллы. Этот класс используется как для учеников, так и для предметов.
 * <p>Класс AnalyzeByMap получает статистику по аттестатам.
 * <p>1. Метод averageScore() - вычисляет общий средний балл.
 * <p>2. Метод averageScoreByPupil() - вычисляет средний балл по каждому ученику.
 * <p>То есть берем одного ученика и считаем все его баллы за все предметы и делим на количество предметов.
 * <p>Возвращает список из объекта Label (имя ученика и средний балл).
 * <p>3. Метод averageScoreBySubject() - вычисляет средний балл по каждому предмету.
 * <p>Например, собираем все баллы учеников по предмету география и делим на количество учеников.
 * <p>Возвращает список из объектов Label (название предмета и средний балл).
 * <p>4. Метод bestStudent() - возвращает лучшего ученика. Лучшим считается ученик с наибольшим суммарным
 * баллом по всем предметам. Возвращает объект Label (имя ученика и суммарный балл).
 * <p>5. Метод bestSubject() - возвращает предмет с наибольшим баллом для всех студентов. Возвращает объект Label
 * (имя предмета, сумма баллов каждого ученика по этому предмету).
 * <p>1. Реализуйте методы в классе AnalyzeByMap.
 */

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> averageScore = new ArrayList<>(pupils.size());
        for (Pupil pupil : pupils) {
            double sum = 0;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
            averageScore.add(new Label(pupil.name(), sum / count));
        }
        return averageScore;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Subject> subjectList = pupils.get(0).subjects();
        List<Label> averageScore = new ArrayList<>();
        for (int i = 0; i < subjectList.size(); i++) {
            double sum = 0;
            int count = 0;
            for (Pupil pupil : pupils) {
                sum += pupil.subjects().get(i).score();
                count++;
            }
            averageScore.add(new Label(subjectList.get(i).name(), sum / count));
        }
        return averageScore;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> bestPupil = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            bestPupil.add(new Label(pupil.name(), sum));
        }
        bestPupil.sort(Comparator.reverseOrder());
        return bestPupil.get(0);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Subject> subjectList = pupils.get(0).subjects();
        List<Label> bestSubject = new ArrayList<>();
        for (int i = 0; i < subjectList.size(); i++) {
            double sum = 0;
            for (Pupil pupil : pupils) {
                sum += pupil.subjects().get(i).score();
            }
            bestSubject.add(new Label(subjectList.get(i).name(), sum));
        }
        bestSubject.sort(Comparator.reverseOrder());
        return bestSubject.get(0);
    }
}

record Subject(String name, int score) {
}

record Pupil(String name, List<Subject> subjects) {
}

record Label(String name, double score) implements Comparable<Label> {
    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}

// Каркас 1.:
//import java.util.List;
//
//public class AnalyzeByMap {
//    public static double averageScore(List<Pupil> pupils) {
//        return 0D;
//    }
//
//    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
//        return List.of();
//    }
//
//    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
//        return List.of();
//    }
//
//    public static Label bestStudent(List<Pupil> pupils) {
//        return null;
//    }
//
//    public static Label bestSubject(List<Pupil> pupils) {
//        return null;
//    }
//}
//
//record Subject(String name, int score) {
//}
//
//record Pupil(String name, List<Subject> subjects) {
//}
//
//record Label(String name, double score) implements Comparable<Label> {
//    @Override
//    public int compareTo(Label o) {
//        return Double.compare(this.score, o.score);
//    }
//}