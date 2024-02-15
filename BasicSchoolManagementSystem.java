class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private Teacher[] teachers;
    private int teacherCount;
    private int maxTeachers;

    public Department(String name, int maxTeachers) {
        this.name = name;
        this.maxTeachers = maxTeachers;
        this.teachers = new Teacher[maxTeachers];
        this.teacherCount = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacherCount < maxTeachers) {
            teachers[teacherCount] = teacher;
            teacherCount++;
        }
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public String getName() {
        return name;
    }
}

class School {
    private String name;
    private Department[] departments;
    private int departmentCount;
    private int maxDepartments;

    public School(String name, int maxDepartments) {
        this.name = name;
        this.maxDepartments = maxDepartments;
        this.departments = new Department[maxDepartments];
        this.departmentCount = 0;
    }

    public void addDepartment(Department department) {
        if (departmentCount < maxDepartments) {
            departments[departmentCount] = department;
            departmentCount++;
        }
    }

    public Department[] getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }
}

public class BasicSchoolManagementSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Sir Sohaib");
        Teacher t2 = new Teacher("Sir Imran");
        Teacher t3 = new Teacher("Sir Lashari");

        Department m = new Department("Math Department", 2);
        Department s = new Department("Science Department", 1);

        m.addTeacher(t1);
        m.addTeacher(t2);
        s.addTeacher(t3);

        School school = new School("OISS", 2);
        school.addDepartment(m);
        school.addDepartment(s);

        System.out.println("School Name: " + school.getName());

        Department[] arr = school.getDepartments();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("Department Name: " + arr[i].getName());
                Teacher[] teachers = arr[i].getTeachers();
                for (int j = 0; j < teachers.length; j++) {
                    if (teachers[j] != null) {
                        System.out.println("Teacher Name: " + teachers[j].getName());
                    }
                }
            }
        }
    }
}