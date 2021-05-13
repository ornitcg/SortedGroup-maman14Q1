public class Student implements Comparable<Student>{
    private String _sName;
    private String _sId ;
    private Integer _grade ;


    /**
     * Constructor
     * @param name
     * @param id
     * @param grade
     */
    public Student(String name, String id, Integer grade) {
        _sName = name;
        _sId = id;
        _grade = grade;
    }

    /**
     * Copy Constructror
     * @param other
     */
    public Student (Student other){
        _sName = other.get_sName();
        _sId = other.get_sId();
        _grade = other.get_grade();
    }

    public Student(int grade) {
        _sName = "";
        _sId = "";
        _grade = grade;
    }


    public String toString(){
        return "Student Name : " + _sName + ", ID : " + _sId + ", grade: " + _grade;
    }


    @Override
    public int compareTo(Student other) {
        return _grade - other.get_grade();
    }


    //////////////////////////////////////  Getters & Setters ///////////////////////////////////////////////////

    public String get_sName() {
        return _sName;
    }

    public void set_sName(String _sName) {
        this._sName = _sName;
    }

    public String get_sId() {
        return _sId;
    }

    public void set_sId(String _sId) {
        this._sId = _sId;
    }

    public Integer get_grade() {
        return _grade;
    }

    public void set_grade(Integer _grade) {
        this._grade = _grade;
    }



}
