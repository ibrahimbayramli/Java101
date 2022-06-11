public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2, int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    void run(){
        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("***********Yeni Raund***********");
                this.f2.health=this.f1.hit(this.f2);
                if (isWin()) break;
                this.f1.health=this.f2.hit(f1);
                if (isWin()) break;

                System.out.println(this.f1.name+" saglik: "+this.f1.health);
                System.out.println(this.f2.name+" saglik: "+this.f2.health);

            }
        }
        else System.out.println("Sporcularin sikletleri uymuyor.");
    }
    boolean isCheck(){
        return (this.f1.weigth>=minWeight && this.f1.weigth<=maxWeight)&&(this.f2.weigth>=minWeight && this.f2.weigth<=maxWeight);
    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+" kazandi.");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" kazandi.");
            return true;
        }
        return false;
    }
}
