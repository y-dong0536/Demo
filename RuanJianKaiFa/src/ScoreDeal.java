import java.util.ArrayList;
import java.util.List;

public class ScoreDeal {
	List<String> slist=new  ArrayList<String>();
	List<String> listPass = new ArrayList<String>();
	List<String> listFine = new ArrayList<String>();
	String max="0" ,mix="0";
	double mid=0.0,sum=0.0;
	int passsum=0;double pass=0.0;
	int finesum=0; double fpass=0.0;
	public ScoreDeal(List<String> lists) {
		slist=lists;
	}
	
	public String Max() {
	//�����ֵ
		for (String i : slist) {
			if(i.compareTo(max) >0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
			{
				max=i;
			}
		}
			return max;
	}
	
	
	
		public String Mix() {	
			//��Сֵ
			
			for (String i : slist) {
				mix=slist.get(0);
				if(i.compareTo(mix) <0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
				{
					mix=i;
				}
			}
			return mix;
			
			
		}
		
		public double Mid() {

			//��ֵ
			if(slist.size()%2==0)//��������Ϊż��
			{
				
				mid = (Integer.parseInt(slist.get(slist.size()/2-1))+Integer.parseInt(slist.get(slist.size()/2)))/2;
				  
			}else 
			{
				
				mid = Integer.parseInt(slist.get(slist.size()/2));
			}
			return mid;
		}
		
		
		public List<String> Pass() {
			//����ͳ��
			for(int i=0;i<slist.size();i++) {
				if(slist.get(i).compareTo("60") >0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
				{
					listPass.add(slist.get(i));
					passsum++;
				}
			}
			 pass=Double.valueOf(passsum) /slist.size()*100;//������
			return listPass;
			}
		
		public List<String> Fine(){
			//����ͳ��
			
			for(int i=0;i<slist.size();i++) {
				if(slist.get(i).compareTo("80") >0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
				{
					listFine.add(slist.get(i));
					finesum++;
				}			
			}
			fpass=Double.valueOf(finesum) /slist.size()*100;//������
			return listFine;
		}
			
			public double Average() {
			//ƽ��ֵ
			int i;
			for( i=0;i<slist.size();i++) {
				sum+=Integer.parseInt(slist.get(i));
			}
			return (sum/i);
			}
			
}
