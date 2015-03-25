package Listeners;

import java.io.File;
import java.util.Date;
import java.util.Hashtable;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Custom_Listners extends TestListenerAdapter implements IInvokedMethodListener,ISuiteListener{
	public static Hashtable<String, String> resultTable;
	public static String resultFolderName;
	public void onTestFailure(ITestResult tr){
		report(tr.getName(),tr.getThrowable().getMessage());
		
	}
	public void onTestSkipped(ITestResult tr){
		report(tr.getName(),tr.getThrowable().getMessage());
	}
	public void onTestSuccess(ITestResult tr){
		report(tr.getName(),"PASS");
	}
	public void afterInvocation(IInvokedMethod method, ITestResult result ){
		
	}
	public void beforeInvocation(IInvokedMethod args0, ITestResult test ){
		
	}
	
	public void onStart(ISuite suite) {
		System.out.println("Starting Suite"+suite.getName());
		if(resultTable==null)
		resultTable=new Hashtable <String,String>();
		if(resultFolderName==null){
			Date d=new Date();
			resultFolderName=d.toString().replace(":", "_");
			File f=new File(System.getProperty("user.dir"+"//target//Reprts//"+resultFolderName));
			f.mkdir();
		}
		
	}
	
	public void onFinish(ISuite suite) {
		if(resultTable!=null){
			System.out.println("Finishing Suite "+suite.getName());
			System.out.println(resultTable);
			resultTable=null;
			}
	}
			

		public void report(String name,String result){
			//Iteration
			int iteration_number=1;
			while(resultTable.containsKey(name+"Iteration"+result)){
				iteration_number++;
			}
			resultTable.put(name+"Iteration"+iteration_number, result);
		}
		
}
