    package nl.ivonet;

    import java.util.Scanner;

    public class Grade {
        private final String letterGrade;
        private final Q011.Term term;
        private String letter;
        private String symbol = "n";
        private double numericGrade;
        private static final double PLUS = 0.3;
        private static final double MENO = -0.3;

        public Grade(final String letterGrade) {
            this.letterGrade = letterGrade;
            term = null;
        }

        public Grade(final Q011.Term term, final String letter) {
            this.letterGrade = letter;
            this.term = term;

        }

        public double getNumericGrade() {
            if (this.letterGrade.length() > 1) {
                this.letter = this.letterGrade.substring(0, 1);
                this.symbol = this.letterGrade.substring(1, 2);
            } else {
                this.letter = this.letterGrade;
            }

            if ("A".equals(this.letter)) {
                this.numericGrade = 4.0;

                if ("+".equals(this.symbol)) {
                    this.symbol = "n";
                }

            } else if ("B".equals(this.letter)) {
                this.numericGrade = 3.0;

            } else if ("C".equals(this.letter)) {
                this.numericGrade = 2.0;

            } else if ("D".equals(this.letter)) {
                this.numericGrade = 1.0;

            } else if ("F".equals(this.letter)) {
                this.numericGrade = 0.0;

            }

            final double grade;
            if ("+".equals(this.symbol)) {
                grade = this.numericGrade + PLUS;

            } else if ("-".equals(this.symbol)) {
                grade = this.numericGrade + MENO;

            } else {
                grade = this.numericGrade;

            }

            return grade;
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Please enter the grade in letter form: ");
            String letterGrade = in.next();

            if ("A".equals(letterGrade) || "A+".equals(letterGrade) || "A-".equals(letterGrade)) {
                Grade graduation = new Grade(letterGrade);

                System.out.println("The grade in number form is: " + graduation.getNumericGrade());
            } else if ("B".equals(letterGrade) || "B+".equals(letterGrade) || "B-".equals(letterGrade)) {
                Grade graduation = new Grade(letterGrade);

                System.out.println("The grade in number form is: " + graduation.getNumericGrade());
            } else if ("C".equals(letterGrade) || "C+".equals(letterGrade) || "C-".equals(letterGrade)) {
                Grade graduation = new Grade(letterGrade);

                System.out.println("The grade in number form is: " + graduation.getNumericGrade());
            } else if ("D".equals(letterGrade) || "D+".equals(letterGrade) || "D-".equals(letterGrade)) {
                Grade graduation = new Grade(letterGrade);

                System.out.println("The grade in number form is: " + graduation.getNumericGrade());
            } else if ("F".equals(letterGrade)) {
                Grade graduation = new Grade(letterGrade);

                System.out.println("The grade in number form is: " + graduation.getNumericGrade());
            } else {
                System.out.println("Not permissed!");
            }
        }
    }