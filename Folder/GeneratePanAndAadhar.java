import java.util.Scanner;
import java.util.*;
import java.util.regex.*;

class GeneratePANAndAadharNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String PANNo = null;
        String aadharNo = null;
        String personName = scan.nextLine();
        Integer age = scan.nextInt();
        Long mobileNo = scan.nextLong();
        Person person = new Person(personName, age, mobileNo);

        if (validate(person)) {
            PANNo = generatePANNumber(person);
            aadharNo = generateAadharNumber(person);
            System.out.println("Success: Your PAN Number is:" + PANNo + " and Aadhar Number is:" + aadharNo + ".");

        } else {
            System.out.println("Error: Your PAN and Aadhar Number can't be generated.");
        }

        scan.close();

    }

    public static Boolean validate(Person person) {
        String st[] = person.getName().split(" ");
        for(int i = 0; i < st.length; i++)
        {
            if(Pattern.matches("([A-Z//W][a-z//W][//s]?)",st[i].toString()) == false)
            {
                System.out.println("Error: Provided Name/Age/MobileNo is Invalid. ");
                return false;
            }
        }
        if(person.getAge() < 18 || person.getAge() > 59)
        {
            System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
            return false;
        }
        if(Long.toString(person.getMobileNo()).length() != 10 || person.getMobileNo().toString().length() % 1111111111 == 0)
        {
             System.out.println("Error: Provided Name/Age/MobileNo is Invalid.");
            return false;
        }
        return true;
    }

    public static String generatePANNumber(Person person) {
       
        String st[] = person.getName().split(" ");
        String ns = "";
        String ans = "";
        for(int i = 0; i < st.length; i++)
        {
            ns += st[i];
        }
        if(ns.length() >= 6)
        {
            ans += ns.substring(0,5).toUpperCase()+person.getAge()+person.getAge()+ns.substring(5,6).toUpperCase();
        }
        else
        {
            ans += ns.toUpperCase();
         
            while (ans.length() <= 4)
            {
                    ans+="A";   
            }
            ans = ans + person.getAge()+person.getAge()+"Z";
        }
        
        return ans;
    }

    public static String generateAadharNumber(Person person) {
        String st = "";
        st += "1234 " + person.getAge()+person.getAge()+" 9876";
        
        
        return st;

    }

}

class Person {
    private String name;
    private Integer age;
    private Long mobileNo;

    public Person(String name, Integer age, Long mobileNo) {
        super();
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

}
