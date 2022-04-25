package fit;

public class Student {
    private String ra;

    public Student() {
        super();
    }

    public Student(String ra) {
        this.ra = ra;
    }

    @Override
    public int hashCode() {
        if (ra == null) return "Student".hashCode();
        return ra.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;
        if (ra == null) {
            if (other.ra != null)
                return false;
        } 
        
        return ra.equals(other.ra);
    }

    

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
}
