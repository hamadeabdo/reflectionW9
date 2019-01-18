package reflection9;

import exercise.week9.reader.FileReader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class studentsApplication {
    public static void main(String[] args) {
        new FileReader().asStream("reflection9/students-performance.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(columns->new Students(columns[0], String.valueOf(columns[1]),
                        Integer.valueOf(columns[2]),
                        Integer.valueOf(columns[3]),
                        Integer.valueOf(columns[4])))
                .sorted(Comparator.comparing(e->e.getGender()))
                .map(e-> Arrays.asList(e))

    }
}
