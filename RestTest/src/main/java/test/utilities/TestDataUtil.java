package test.utilities;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//import org.json.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

public class TestDataUtil {
	
	protected static JSONObject getDataFile(String dataFile) {
	    
	    JSONObject testObject = null; 

	    try {
	        FileReader reader = new FileReader(dataFile);                        
	        JSONParser jsonParser = new JSONParser();
	        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
	        testObject = (JSONObject) jsonObject;
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

	    return testObject;
	}
	
	public static Object[][] getTestScenarios(String dataFile, String testCaseName) throws JSONException {

	    JSONArray testCase = (JSONArray) getDataFile(dataFile).get(testCaseName);

	    List<JSONObject> testScenarioArray = new ArrayList<JSONObject>();

	    for (int i = 0; i < testCase.size(); i++) {
	         testScenarioArray.add((JSONObject) testCase.get(i));
	    }

	    Object[][] dataProviderArray = new Object[testScenarioArray.size()][];
	    for (int scenario = 0; scenario < testScenarioArray.size(); scenario++) {
	        String scenarioName = null;

	        if ((String) testScenarioArray.get(scenario).get("testScenario") != null) {
	            scenarioName = (String) testScenarioArray.get(scenario).get("testScenario");
	        } else {
	            scenarioName = "No scenario name specified";
	        };
	        dataProviderArray[scenario] = new Object[] { scenarioName, (JSONObject) testScenarioArray.get(scenario) };
	    }
	    return dataProviderArray;
	}
	
	

}
