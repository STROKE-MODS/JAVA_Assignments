package Question2;

abstract class Person {
    static int count=0;
    private String name;
    abstract String PersonID();
    Person(String name)
    {
        this.name = name;
    }
    String getname()
    {
        return name;
    }
    void setname(String name)
    {
        if(name!=null && !name.isBlank())
        {
            this.name = name;
        }
    }
    @Override 
    public String toString()
    {
        return "Name :" +getname();
    }
    
}
class Student extends Person
{
    private int[] performance = new int [5];
    private int perf_no = 0;
    private String personID;
    void setperformance(int performance)
    {
        if(this.performance.length>perf_no){

            this.performance[perf_no] = performance;
            perf_no++;
        }
    }
    int[] getperformance()
    {
        int[] b = new int[perf_no];
        int x=0;
        for(int j:performance)
        {
            if(j!=0)
            {

                b[x]= j;
                x++;
            }
        }
        return b;
    }
    void setPersonID(String personID)
    {
        this.personID = personID;
    }
    Student(String name)
    {
        super(name);
        performance = new int[5];
    }
    @Override 
    String PersonID()
    {
        return personID;
    }
    @Override 
    public String toString()
    {
        return "Name : "+getname()+"\nFirst subject Marks : "+performance[0];
    }
}
class Faculty extends Person
{
    private String personID;
    private String department;
    Faculty(String name)
    {
        super(name);
    }
    @Override
    String PersonID()
    {
        return personID;
    }
    void setDepartment(String department)
    {
        if(department!=null && !department.isEmpty())
        this.department = department;
    }
    String getDepartment()
    {
        return department;
    }
    void setPersonID(String personID)
    {
        if(personID!=null && !personID.isEmpty())
        {
            this.personID = personID;
        }
    }
    @Override 
    public String toString()
    {
        return "Name : "+getname()+"\nDepartment : "+department;
    }
}
class CampusRegistry
{
    private int size;
    private int Campussize;
    private Person[] per;
    CampusRegistry(int Campussize)
    {
        if(Campussize>0)
        {

            this.Campussize = Campussize;
            this.per = new Person[Campussize];
        }
    }
    Person searchperson(String name)
    {
        for(int i=0;i<size;i++)
        {
            if(per[i].getname().equals(name))
            {
                return  per[i];
            }
        }
        return null;
    }
    int getcountStudent()
    {
        int t=0;
        for(int i=0;i<per.length;i++)
        {
            if(per[i].getClass().getSimpleName().equals("Student"))
            {
                t++;
            }
        }
        return t;
    }
    int getpersoncount()
    {
        return size;
    }
    void addPerson(Person p)
    {
        if(per.length>size)
        {
            per[size] = p;
            size++;
        }
    }
    int getCampisSize()
    {
        return Campussize;
    }
    @Override 
    public String toString()
    {
        return "Campus Size : "+Campussize+"\nNumber of person : "+per.length;
    }
}