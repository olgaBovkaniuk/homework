package com.gmail.olgabovkaniuk.bovkaniuk_19.class_task.task2;

public class Course {
    private final int courseNumber;
    private final int numberOfStudents;
    private final String courseName;
    private final String startDate;
    private final String endDate;

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Course(int courseNumber, int numberOfStudents, String courseName, String startDate, String endDate) {
        this.courseNumber = courseNumber;
        this.numberOfStudents = numberOfStudents;
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private Course(CourseBuilder courseBuilder) {
        courseNumber = courseBuilder.courseNumber;
        numberOfStudents = courseBuilder.numberOfStudents;
        courseName = courseBuilder.courseName;
        startDate = courseBuilder.startDate;
        endDate = courseBuilder.endDate;
    }

    public static CourseBuilder newCourseBuilder() {
        return new CourseBuilder();
    }

    public static final class CourseBuilder {
        private int courseNumber;
        private int numberOfStudents;
        private String courseName;
        private String startDate;
        private String endDate;

        private CourseBuilder() {
        }

        public CourseBuilder withCourseNumber (int val) {
            courseNumber = val;
            return this;
        }

        public CourseBuilder withNumberOfStudents (int val) {
            numberOfStudents = val;
            return this;
        }

        public CourseBuilder withCourseNumber (String val) {
            courseName = val;
            return this;
        }

        public CourseBuilder withStartDate (String val) {
            startDate = val;
            return this;
        }

        public CourseBuilder withEndDate (String val) {
            endDate = val;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
