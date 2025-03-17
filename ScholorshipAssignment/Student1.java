package ScholorshipAssignment;

public class Student1 {
    String name,collegeName;
    float percentage,scholarship;
    Student1( String name,String collegeName,float percentage){
      this.name= name;
     this.collegeName=collegeName;
       this.percentage= percentage;
//       this.scholarship= scholarship;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", percentage=" + percentage +
                ", scholarship=" + scholarship +
                '}';
    }
}
