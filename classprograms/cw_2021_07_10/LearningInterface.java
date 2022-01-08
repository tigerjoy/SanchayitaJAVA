

interface CanCompare {
    // By default the methods are public and abstract
    int compareTo(Object obj2);
}

interface CanDisplay
{
  void display();
}

abstract class Person implements CanCompare, CanDisplay{
    int age;
    String name;
    
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}


// Employee obj1 = new Employee();

// Access the salary data member of obj1
// obj1.salary

class Employee extends Person {
    int salary;
    
    Employee(int age, String name, int salary){
        super(age, name);
        this.salary = salary;
    }
    
    public int compareTo(Object obj2){
      if(obj2 instanceof Employee){
        Employee emp2 = (Employee) obj2;
        return this.salary - emp2.salary;
      }
      return 0;
    }
    // Employee(age=23, name=Ranajoy, salary=40000)
    public void display()
    {
      // printf("format-string", arg1, arg2, ...);
      System.out.printf("Employee(age=%d, name=%S, salary=%d)\n", age,name,salary);
    }
}

class Student extends Person  {
    int marks;
    
    Student(int age, String name, int marks) {
        super(age, name);
        this.marks = marks;
    }
    
    public int compareTo(Object obj2){
      if(obj2 instanceof Student){
        Student student2 = (Student) obj2;
        return this.marks - student2.marks;
      }
      return 0;
    }

    // Student(age=23, name=Ranajoy, marks=99)
    public void display()
    {
      // printf("format-string", arg1, arg2, ...);
      System.out.printf("Student(age=%d, name=%S, marks=%d)\n", age,name,marks);
    }
}

class Box implements CanCompare, CanDisplay {
    int length;
    int breadth;
    int height;
    
    Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    int volume(){
        return length * breadth * height;
    }
    
    public int compareTo(Object obj2){
        if(obj2 instanceof Box){
            Box box2 = (Box) obj2;
            return this.volume() - box2.volume();
        }
      return 0;
    }

    // Box(l=10, b=20, h=30, v=6000)
    public void display()
    {
      // printf("format-string", arg1, arg2, ...);
      System.out.printf("Box(l=%d, b=%d, h=%d, v=%d)\n", length,breadth,height, volume());
    }
}

class LearningInterface
{   
    static void sort(CanCompare arr[])
    {
      int n = arr.length;
      for(int i = 0; i <= n-2; i++)
      {
        for(int j = 0; j <= n - 2 - i; j++)
        {
          // if(arr[j] > arr[j + 1])
          if(arr[j].compareTo(arr[j + 1]) > 0)
          {
            CanCompare temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
    }
    
    static void displayArray(CanDisplay arr[])
    {
      for(int i=0;i<=arr.length-1;i++)
      {
        arr[i].display();
      }
      System.out.println();
    }
    public static void main(String[] args) 
    {
      // 1. 
      // int arr[] = new int[5];

      // 2.
      // int daysOfMonths[] = { 31, 29, 31, ... };

      // Employee obj = new Employee(...);
      Employee empArr[] = {
        new Employee(23, "Ranajoy", 40000),
        new Employee(22, "Sanchayita", 50000),
        new Employee(24, "Raj", 30000),
        new Employee(26, "Apurba", 90000),
        new Employee(29, "Suvodeep", 20000),
        new Employee(21, "Abhro", 26000),
        new Employee(27, "Indrila", 45000),
        new Employee(28, "Adrija", 35000)
      };
      
      Student studentArr[] = {
          new Student(17, "Sanchayita", 100),
          new Student(23, "Ranajoy", 99),
          new Student(22, "Neelangshu", 97),
          new Student(21, "Shouvik", 80),
          new Student(21, "Himanshu", 97),
          new Student(16, "Anushka", 93),
          new Student(15, "Ridhima", 95),
          new Student(15, "Rishikalpa", 96)
      };
      
      Box boxArr[] = {
          new Box(50, 40, 30),
          new Box(40, 20, 30),
          new Box(60, 90, 100),
          new Box(10, 30, 10),
          new Box(40, 20, 15),
          new Box(30, 20, 15)
      };
      
      System.out.println("Before sorting empArr");
	    displayArray(empArr);
	    
	    sort(empArr);
	    
	    System.out.println("After sorting empArr");
	    displayArray(empArr);
	    
	    System.out.println("Before sorting boxArr");
	    displayArray(boxArr);
	    
	    sort(boxArr);
	    
	    System.out.println("After sorting boxArr");
	    displayArray(boxArr);
            
      System.out.println("Before sorting studentArr");
	    displayArray(studentArr);
	    
	    sort(studentArr);
	    
	    System.out.println("After sorting studentArr");
	    displayArray(studentArr);
  }
}