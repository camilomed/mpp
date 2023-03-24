package LabStreamLvl3;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import labStreamLvl1.Employee;

public class mainExam {
	
	public static void main(String[] args) {
		List<ExamData> data = new ArrayList<ExamData>() {{
			add(new ExamData("Georage", 91.3));
			add(new ExamData("Tom", 88.9));
			add(new ExamData("Rick", 80));
			add(new ExamData("Harold", 90.8));
			add(new ExamData("Ignatius", 60.9));
			add(new ExamData("Anna", 77));
			add(new ExamData("Susan", 87.3));
			add(new ExamData("Phil", 99.1));
			add(new ExamData("Alex", 84));
		};
	};
	
	DoubleSummaryStatistics stadistic=	data.stream().map(ExamData::getTestScore).collect(Collectors.summarizingDouble(Double::doubleValue));
	System.out.println(stadistic.getAverage());

}
}
