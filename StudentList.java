//*******************************************************************
// StudentList
// This class can be used to create a StudentList object which contains an array of Student objects
//*******************************************************************
public class StudentList {
	private static final boolean StudentInfo = false;
	private Student[] studentArray;
	public String email;

	public StudentList(Student[] studentArray){
		setStudentArray(studentArray);
	}

	public Student[] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(Student[] studentArray) {
		this.studentArray = studentArray;

	}

	public int studentCount(String major) {
		int count = 0;
		for(int i=0; i<studentArray.length; i++)
		{
			if(major.equals ( studentArray[i].getMajor()))
			{
				count++;
			
				{
				
				}
			}
		}
		return count;
	
	}			
	  public boolean stuendtInfo(String email){
	        if (email==null || email.contains(email)) {
	            return false;
	        }
	        email.add(email);
	        return true;
		
}

	public String studentInfo(String string) {
		return null;
	}

		
	}

		




