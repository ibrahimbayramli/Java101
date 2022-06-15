public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        double salaryTax=0;
        if(this.salary<1000){


            return salaryTax;
        }else {
            salaryTax= this.salary*0.03;
            return salaryTax;
        }
    }
    int bonus(){
        int salaryBonus=0;
        if(this.workHours>40){
            salaryBonus=(this.workHours-40)*30;
        }
        return salaryBonus;
    }
    double raiseSalary(){
        int hire=2021-this.hireYear;
        double raiseSalary=0;
        if(hire<10){
            raiseSalary=this.salary*0.05;
        }else if(hire>9 && hire<20){
            raiseSalary=this.salary*0.1;
        }else if(hire>19){
            raiseSalary=this.salary*0.15;
        }
        return raiseSalary;

    }
    void print(){
        System.out.println("Adi: "+this.name);
        System.out.println("Maas: "+this.salary);
        System.out.println("Calisma saati: "+this.workHours);
        System.out.println("Ise baslangic yili: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maas artisi: "+raiseSalary());
        System.out.println("Vergiler ve bonusla birlikte maas: "+(this.salary+bonus()-tax()));
        System.out.println("Toplam maas: "+(this.salary+raiseSalary()));
    }
}
