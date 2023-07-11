/**
 * The class calculates the total amount and simple interest based on the rate of interest, principal
 * amount, and simple amount.
 */


 import java.util.function.Function;

class moneyCalculator
{
    int RateOfInterest;
    int principalAmount;
    int simpleAmount;
    
    moneyCalculator(int rate ,int principalAmount,int simpleAmount)
    {
        this.RateOfInterest=rate;
        this.principalAmount=principalAmount;
        this.simpleAmount=simpleAmount;
        this.totalAmount();
        this.simpleInterest();
    }

    public void  totalAmount()
    {
        System.out.println("total amount of is :"+principalAmount*(RateOfInterest*simpleAmount*100));
    }

    public void simpleInterest()
    {
        System.out.println("simple interest is :"+(RateOfInterest*simpleAmount*100));
    }
    
}



public class Rateofinterest {

    public static void main(String[] args) {
        moneyCalculator[] firstC=new moneyCalculator[3];

               firstC[0]=new moneyCalculator(35,43,32);
               firstC[1]=new moneyCalculator(34,32,23);
    }
    
}
