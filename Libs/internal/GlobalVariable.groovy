package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object LinkURL
     
    /**
     * <p></p>
     */
    public static Object GlobalUsername
     
    /**
     * <p></p>
     */
    public static Object GlobalPassword
     
    /**
     * <p></p>
     */
    public static Object LinkURLProd
     
    /**
     * <p></p>
     */
    public static Object ProdUsername
     
    /**
     * <p></p>
     */
    public static Object ProdPassword
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            LinkURL = selectedVariables['LinkURL']
            GlobalUsername = selectedVariables['GlobalUsername']
            GlobalPassword = selectedVariables['GlobalPassword']
            LinkURLProd = selectedVariables['LinkURLProd']
            ProdUsername = selectedVariables['ProdUsername']
            ProdPassword = selectedVariables['ProdPassword']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
