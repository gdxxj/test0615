// add by gdxxj 14-7 00:05

package temp;
public class Player {
int number = 0;  
public void guess() {
number = (int) (Math.random() * 10);
System.out.println("I¡¯m guessing"+ number);
}
}
