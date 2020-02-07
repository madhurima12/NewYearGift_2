package newyeargift;
import Gifts.NewYearGift1;
import gifts_chocolate.Gift_chocolate;
public class Candy extends Gift_chocolate 
{
public Candy(int weight,int price)
{
super(weight,price);
}
public int getWeight()
{
return weight;
}
public int getPrice()
{
return price;
}
}