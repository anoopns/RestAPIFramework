package test.utilities;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;


public class DataProviderSource {
	
	@DataProvider(name = "dataProvider")
	public static Object[][] dataProvider(Method method, ITestContext context) throws Throwable {

		String testDatafilePath = Constants.testDataFolder +"/"+method.getDeclaringClass().getSimpleName()+".json";
		String parentElement = method.getName();
		
		return TestDataUtil.getTestScenarios(testDatafilePath, parentElement);
	}	
	
	
}
