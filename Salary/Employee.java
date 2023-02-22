package Salary;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    int tax(){
        if(this.salary<=1000){
            return 0;
        }else{
            return 3;
        }
    }

    int bonus(){
        int overTime=this.workHours-40;
        if(this.workHours>40){
            return overTime*30;
        }else{
            return 0;
        }
    }
    int raiseSalary(){
        int year=2023;
        if(year-hireYear<10){
            return 5;
        }else if(year-hireYear>10 && year-hireYear<20){
            return 10;
        }else{
            return 15;
        }
    }
    void toStringEmployee(){
        double tax=this.salary*tax()/100;
        double result=this.salary-tax+bonus()+(this.salary*raiseSalary()/100);
        System.out.println(
                "Adi : "+ this.name+"\n"+
                "Maasi : "+this.salary+"\n"+
                "Calisma Saati : "+ this.workHours+"\n"+
                "Baslangic Yili : "+ this.hireYear+"\n"+
                "Vergi : "+ tax+"\n"+
                "Bonus : "+bonus()+"\n"+
                "Vergi ve Bonuslar ile maas: "+ (this.salary-tax+bonus())+"\n"+
                "Toplam maas : "+result);
    }
}
