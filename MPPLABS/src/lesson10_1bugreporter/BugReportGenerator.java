package lesson10_1bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import lesson10_1classfinder.ClassFinder;


/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
//	C:/Users/User/OneDrive/Documents/miu/mpp/lesson10/
	private static final String PACKAGE_TO_SCAN = "lesson10_1javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	boolean dev ;
	StringBuilder build = new StringBuilder();
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		 String path = "./src/"+PACKAGE_TO_SCAN.replace(".", "/") +"/";
		Map<String, StringBuilder> mapping = new HashMap<String, StringBuilder>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				String assignedTo = annotation.assignedTo();
				 dev = !mapping.containsKey(assignedTo);
				 addToBuild(annotation,cl);
				if	(dev) 	mapping.put(assignedTo, build);
				else 				mapping.get(assignedTo).append("\n"+build);
			}
			 build = new StringBuilder();
		}
		 
		 try(PrintWriter prtWritter = new PrintWriter(new FileWriter(path+ REPORT_NAME))) {
		  prtWritter.print(mapping.toString());
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	
	private void addToBuild(BugReport annotation, Class<?> cl) {
		build.append("\n   reportedBy: "+annotation.reportedBy());
		build.append("\n   reportedBy: "+annotation.reportedBy());
		build.append("\n   className: "+cl.getName());
		build.append("\n   description: "+annotation.description());
		build.append("\n   severity: "+annotation.severity());
		build.append("\n");
	}
	
	
}
