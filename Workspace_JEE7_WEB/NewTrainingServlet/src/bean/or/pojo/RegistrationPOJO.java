package bean.or.pojo;

public class RegistrationPOJO
{
	private int id;
	private String fname;
	private String lname;
	private String add;
	private String mobile;
	private String dept;
	private String uname;
	private String upwd;
	
	
	
	public RegistrationPOJO()
	{
		this.id=0;
		this.fname = null;
		this.lname = null;
		this.add = null;
		this.mobile = null;
		this.dept = null;
		this.uname = null;
		this.upwd=null;
		
	}
	
	
	public RegistrationPOJO(int id,String fname, String lname, String add, String mobile, String dept, String uname,
			String upwd) {
		super();
		this.id=id;
		this.fname = fname;
		this.lname = lname;
		this.add = add;
		this.mobile = mobile;
		this.dept = dept;
		this.uname = uname;
		this.upwd = upwd;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
}
