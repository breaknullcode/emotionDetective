package www.ehaoyao.fsd.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import www.ehaoyao.fsd.bean.AtitudeBean;
import www.ehaoyao.fsd.ibatis.SqlMapClientDaoSupport;

public class IoUtil {
 
	private  boolean singleuser;//判断一个用户的一次聊天
	private  int startsUser = 1;//0开始 1结束
	
	
	
	
	public  List<AtitudeBean> selfReadFile(String strFileName){  
		int a = 0;
		List<AtitudeBean> ablist = new ArrayList<AtitudeBean>();
		StringBuffer buf=null;  
		BufferedReader breader = null;//reader for the template files   
		try   
		{   
		breader = new BufferedReader(new InputStreamReader(new FileInputStream((strFileName)),Charset.forName("utf-8")));   
		buf = new StringBuffer(); 
		AtitudeBean ab = new AtitudeBean();
		while(breader.ready()){   
		String stringLine = breader.readLine();
//		System.out.println(stringLine);
			//分析过滤
			 if(startsUser==0){
			if("".equals(stringLine)||stringLine==null){
				//填充实体类
				ablist.add(ab);
				//开始一个人的聊天
//				startsUser = 0;
				//创建实体类
				ab = new AtitudeBean();
				
			}else if(stringLine!=""&&stringLine.length()>5&&stringLine.substring(0, 5).equals("2016-")){
				//获取时间和用户
				String qname = stringLine.substring(20, stringLine.length());
//				System.out.println(stringLine);
//				System.out.println(qname+a++);
				if(qname.indexOf("(")>0){
				ab.setQname(qname.substring(qname.indexOf("(")+1, qname.indexOf(")")));
//					ab.setQname(qname);
//                System.out.println(stringLine.substring(0,19));
				}else if(qname.indexOf("<")>0){
					ab.setQname(qname.substring(qname.indexOf("<")+1, qname.indexOf(">")));
//					ab.setQname(qname);
				}
				ab.setQtime(stringLine.substring(0,19));
			}else{
				//判断聊天的类型
				//阵形派  ，图片王，提问君，智多星
				AtitudeBean oldab = new AtitudeBean();
				String AtitudeType = "";
				oldab = ablist.get(ablist.size()-1);
				if(oldab.getContent()!=null){
				if(oldab.getContent().equals(stringLine)){
					AtitudeType = "阵形派";
				}else if(oldab.getContent().contains("？")){
					AtitudeType = "智多星";
				}else if(stringLine.contains("？")){
					AtitudeType = "提问君";
				}else if(stringLine.contains("[图片]")){
					AtitudeType = "图片王";
				}else if(stringLine.contains("[表情]")){
					AtitudeType = "表情帝";
				}else{
					
					AtitudeType = "普通";
				}
				}else{
					AtitudeType = "普通";
				}
				ab.setAtitudeType(AtitudeType);
				if(!checkSpecial(stringLine)){
				ab.setContent(stringLine);
				}else{
					ab.setContent("包含特殊字符");
				}
			}
		
		
			 }else{
				 startsUser = 0;
			 }
		
		}
		breader.close();   
		}//try   
		catch(Exception e)   
		{   
		e.printStackTrace();   
		}//catch   
		return ablist;   
		}
	//导入数据
	public static void main() {
		IoUtil io = new IoUtil();
		SqlMapClientDaoSupport  scd = new SqlMapClientDaoSupport();
		scd.insert(io.selfReadFile("C://jihuang.txt"));
		System.out.println("完成！");
//		String aa = "[图片]123";
//		System.out.println(aa.contains("[图片]"));
	}
	
	public static void main(String[] args) {
		IoUtil io = new IoUtil();
		SqlMapClientDaoSupport  scd = new SqlMapClientDaoSupport();
		scd.insert(io.selfReadFile("C://jihuang.txt"));
		System.out.println("完成！");
		
		
		
	}
	
	
	private boolean checkSpecial(String conten){
		String regEx = "~!/@@#$%^&*()-_+\\|[{}];:\'\"<.>/�ײ�→♥♥💦♥←";
	    Pattern p = Pattern.compile(regEx);
	    Matcher m = p.matcher(conten);
	    return m.find();
	}
	
	/**
	 * 查询
	 */
	public List<AtitudeBean> getRankingList(){
		
		
		return null;
		
	}
	
	
	/**
	 * 判断聊天的类型
	 * @return
	 */
	public String checkAtitudeType(String StringLine){
		//阵形派  ，图片王，提问君，智多星
		
		return null;
		
	}
	
}
