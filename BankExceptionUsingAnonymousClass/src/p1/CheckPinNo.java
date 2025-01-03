/* Assignment-2:(Solution)
Convert BankTransaction-Application into Anonymous InnerClasses
(WithDraw and Deposit classes as Anonymous Classes)
*/

package p1;

public class CheckPinNo 
{
	public boolean verify(int pinNo)
	{
		return switch(pinNo)
		{
		case 1111 : yield true;
		case 2222 : yield true;
		case 3333 : yield true;
		case 4444 : yield true;
		default :yield false;
		};
	}
}
