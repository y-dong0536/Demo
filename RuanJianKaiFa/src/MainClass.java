import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		String max="";//求最大值
		int sum=0;
		String mix="";
		double mid=0.0,average=0.0;
		double pass=0.0,fine=0.0;
		int s20=0,s40=0,s60=0,s80=0,s100=0;//统计区间
		List<String> listPass = new ArrayList<String>();
		List<String> listFine = new ArrayList<String>();
		List<String> lists = new ArrayList<String>();
		
		
		lists.add("50");
		lists.add("70");
		lists.add("90");
		lists.add("60");
		lists.add("85");
		
		ScoreDeal scoreDeal=new ScoreDeal(lists);
		System.out.println("成绩统计："+lists);
		
		List<Integer> mylist= new ArrayList<Integer>();
		
		mylist.add(70);
		mylist.add(90);
		mylist.add(60);
		mylist.add(85);
		mylist.add(80);
		
		
		SortA sorta=new SortA();
		sorta.SortResult(lists);
		
		
		
		max=scoreDeal.Max();
		
		mix=scoreDeal.Mix();
		
		
		mid=scoreDeal.Mid();
		
		listPass=scoreDeal.Pass();
		pass=scoreDeal.pass;
		
		
		listFine=scoreDeal.Fine();
		fine=scoreDeal.fpass;
		
		average=scoreDeal.Average();
		
	ScoreSection scoreSection=new ScoreSection(lists);
	s20=scoreSection.s20;
	s40=scoreSection.s40;
	s60=scoreSection.s60;
	s80=scoreSection.s80;
	s100=scoreSection.s100;
		
		
		
//		
		
		System.out.println("成绩排名："+lists);
		System.out.println("最高分"+max);
		System.out.println("最低分"+mix);
		System.out.println("中值"+mid);
		System.out.println("平均值"+average);
		
		
		System.out.print("及格分统计");
		for (String aa1 : listPass) {
			System.out.print(aa1+"  ");
		}
		System.out.println("\t");
		System.out.println("及格率"+pass+"%");
		System.out.println("\t");
		
		System.out.print("优秀分统计");
		for (String aa1 : listFine) {
			System.out.print(aa1+"  ");
		}
		System.out.println("\t");
		System.out.println("优秀率"+fine+"%");
		System.out.println("\t");
		
		System.out.println("区间分布");
		System.out.println("0-20分:"+s20+"  "+"21-40分:"+s40+"  "+"41-60分:"+s60+"  "+"61-80分:"+s80+"  "+"81-100分:"+s100+" ");

	}

}
