package mvc;

public class mvcMain {
	 public static void main(String[] args)
	    {
	        Model model  =new Model();
	        //retriveStudentFromDatabase();
	 model.setName("sathish");
	 model.setRollNum(12345);
	        View view = new View();
	 
	        Controller controller = new Controller(model, view);
	        controller.seeDetails();
	       controller.setModelName("mani");
	        controller.setRollNum(200);
	        controller.seeDetails();
	    }
	 
	    private static Model retriveStudentFromDatabase()
	    {
	        Model m1 = new Model();
	        m1.setName("Sathish");
	        m1.setRollNum(12345);
	        return m1;
	    }

}
