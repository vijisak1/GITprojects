package parametersnDdataproviders;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Listeners implements IAnnotationTransformer, IRetryAnalyzer

{
	int retry = 3;
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setInvocationCount(2);
		annotation.setRetryAnalyzer(this.getClass());
	}
	
	@Override
	public boolean retry(ITestResult result) {
		if (result.isSuccess() && retry < 4)
		{
			return true;
		} else
			return false;
		
	}
	
}
