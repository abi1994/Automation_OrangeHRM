public class Encap{
	private int EmplyeeId;
	private String EmployeeName;
	
	public int getEmployeeid(){
		return EmplyeeId;
	}
	public static void setEmployeeId(int empId){
	EmplyeeId=empId;
	}
	public static void main (String []Args){
		Encap s = new Encap();
		s.setEmployeeId(4);
		System.out.print(s.getEmployeeid());
	}
		
}