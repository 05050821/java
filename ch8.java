import java.lang.*;

public class ch8 //主類別
{
	public static void main(String args[])
	{
		CShape A[] = new CShape[3];
		A[0]=new CTriangle();
		A[1]=new CRect();
		A[2]=new CPentagon();
		int i;
		for(i=0;i<3;i++)
		{
			A[i].angle();
			System.out.println(A[i].toString());
		}		
	} 
}
abstract class CShape
{
	public int number;    
	public int totalAngle; 
	public abstract void angle();
	public String toString()
	{
		return "正" + number + "邊形的每一角度為" + (totalAngle/number) + "度";
	}
}
class CTriangle extends CShape
{
	@Override public void angle()
	{
		number=3;
		totalAngle=(number-2)*180;
	}
}
class CRect extends CShape
{
	@Override public void angle()
	{
		number=4;
		totalAngle=(number-2)*180;
	}
}
class CPentagon extends CShape
{
	@Override public void angle()
	{
		number=5;
		totalAngle=(number-2)*180;
	}
	
}