package org.com.list;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AllTests {

	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(TestClass.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.getMessage());
		}
	}
}
