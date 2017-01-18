package www.ehaoyao.fsd.bean;

import java.util.Date;

/**
 * 纬度实体类
 * @author Administrator
 *
 */
public class AtitudeBean {

	private int atitudeId;
	private String qname;//网名
	private String atitudeType;//聊天的类型 :阵形派  ，图片王，提问君，智多星  ，万年潜水，唐僧 ，普通
	private int qcount;//次数
	private int qq;//
	private String qtime;//时间
	private String content;//内容
	
	public int getAtitudeId() {
		return atitudeId;
	}
	public void setAtitudeId(int atitudeId) {
		this.atitudeId = atitudeId;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getAtitudeType() {
		return atitudeType;
	}
	public void setAtitudeType(String atitudeType) {
		this.atitudeType = atitudeType;
	}
	public int getQcount() {
		return qcount;
	}
	public void setQcount(int qcount) {
		this.qcount = qcount;
	}
	public int getQq() {
		return qq;
	}
	public void setQq(int qq) {
		this.qq = qq;
	}
	public String getQtime() {
		return qtime;
	}
	public void setQtime(String qtime) {
		this.qtime = qtime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
