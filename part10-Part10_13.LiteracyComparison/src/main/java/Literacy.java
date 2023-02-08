public class Literacy implements Comparable<Literacy> {

    private String country;
    private String gender;
    private double percentage;
    private int year;

    public Literacy(String country, String gender, double percentage, int year) {
        this.country = country;
        this.gender = gender;
        this.percentage = percentage;
        this.year = year;
    }

    @Override
    public int compareTo(Literacy o) {
        if(this.percentage < o.percentage){
            return -1;
        } else if(this.percentage > o.percentage){
            return 1;
        }
        return 0;
    }

    public static Literacy createFromLine(String line){
        String[] readLines = line.split(",");
        String gender = readLines[2].trim().split(" ")[0];
        String country = readLines[3].trim();
        int year = Integer.parseInt(readLines[4].trim());
        double percentage = Double.parseDouble(readLines[5].trim());
        return new Literacy(country, gender, percentage, year);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(country).append(" (").append(year).append("), ").append(gender).append(", ").append(percentage);
        return sb.toString();
    }
}


