package reflection9;

import java.util.stream.Stream;

public class Students {
    private String gender;
    private String levelOfEducation;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;





    public String getGender() {
        return gender;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }

    public Students(String column, String gender, Integer of, Integer valueOf, Integer integer) {
        this.gender = gender;
        this.levelOfEducation = levelOfEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }
}
