package Hook;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.apache.logging.log4j.*;
import org.testng.annotations.*;

public class Hooks {
	
	public HashMap<String,String> data;
	private String Excelpath = "//TestData//TestData.xlsx";
	GetData ExcelData=new GetData(Excelpath);
	public Logger log;
	
	@BeforeMethod
	public void BrforeTest(Method method)throws Exception{
		data = ExcelData.GetDataByTestCase("Data", method.getName());
	}
	
	@BeforeTest
	public void BeforeClass() {
		log = LogManager.getLogger("RestAPIFramework");
	}
}
