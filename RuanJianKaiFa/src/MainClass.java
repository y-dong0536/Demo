import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		String max="";//�����ֵ
		int sum=0;
		String mix="";
		double mid=0.0,average=0.0;
		double pass=0.0,fine=0.0;
		int s20=0,s40=0,s60=0,s80=0,s100=0;//ͳ������
		List<String> listPass = new ArrayList<String>();
		List<String> listFine = new ArrayList<String>();
		List<String> lists = new ArrayList<String>();
		
		
		lists.add("50");
		lists.add("70");
		lists.add("90");
		lists.add("60");
		lists.add("85");
		
		ScoreDeal scoreDeal=new ScoreDeal(lists);
		System.out.println("�ɼ�ͳ�ƣ�"+lists);
		
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
		
		System.out.println("�ɼ�������"+lists);
		System.out.println("��߷�"+max);
		System.out.println("��ͷ�"+mix);
		System.out.println("��ֵ"+mid);
		System.out.println("ƽ��ֵ"+average);
		
		
		System.out.print("�����ͳ��");
		for (String aa1 : listPass) {
			System.out.print(aa1+"  ");
		}
		System.out.println("\t");
		System.out.println("������"+pass+"%");
		System.out.println("\t");
		
		System.out.print("�����ͳ��");
		for (String aa1 : listFine) {
			System.out.print(aa1+"  ");
		}
		System.out.println("\t");
		System.out.println("������"+fine+"%");
		System.out.println("\t");
		
		System.out.println("����ֲ�");
		System.out.println("0-20��:"+s20+"  "+"21-40��:"+s40+"  "+"41-60��:"+s60+"  "+"61-80��:"+s80+"  "+"81-100��:"+s100+" ");

	}

}
