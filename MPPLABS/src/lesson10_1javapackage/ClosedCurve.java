package lesson10_1javapackage;

import lesson10_1bugreporter.BugReport;

@BugReport(assignedTo="Tom Jones", severity=1, reportedBy="Corazza")
public interface ClosedCurve {
	public double computePerimeter();
}
