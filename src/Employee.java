public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double taxRate = 0.03;
        double tax = (this.salary * taxRate);
        if (this.salary > 1000) {
            //return this.salary - (this.salary * taxRate);
            return tax;
        }
        return this.salary;
    }

    double bonus() {
        int mesai;
        int mesaiAl = 0;
        if (workHours > 40) {
            mesai = workHours - 40;
            mesaiAl += mesai * 30;
            return mesaiAl;
        }
        return this.salary;
    }
    double raiseSalary() {
        int result = 2021 - this.hireYear;
        double salaryUp=0;
        if (result < 10) {
            salaryUp = this.salary * 0.05;
            return salaryUp;
        }
        if (result > 9 && result < 20) {
            salaryUp = this.salary * 0.1;
            return salaryUp;
        }
        if (result > 19) {
            salaryUp = this.salary * 0.15;
            return salaryUp;
        }
        return this.salary;
    }

    double totalSalary() {
        return this.salary - tax() + bonus() + raiseSalary() ;
    }

    void salaryCalc() {
        System.out.println("Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saatleri : " + this.workHours  + "\nBaşlangıç Yılı : " + this.hireYear
        + "\nVergi : "+ this.tax() + "\nBonus : "+ this.bonus()  + "\nMaaş Artışı : "+ this.raiseSalary()+ "\nVergi ve Bonuslar ile birlikte Maaş : " + (this.salary - tax() + bonus())
        + "\nToplam Maaş : " + totalSalary());
    }
}
