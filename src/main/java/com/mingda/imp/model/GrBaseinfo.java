package com.mingda.imp.model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

public class GrBaseinfo implements RowMapper<GrBaseinfo>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 332167683436379878L;
	private String other1;
	private String other2;
	private String other3;
	private String other4;
	private String jtbm;
	private String idno;
	private String membername;
	private String fhBm;
	private String fhZjh;
	private String fhAddr;
	private String fhMj;
	private String fhSyr;
	private String fhSyridno;
	private String fhKind;
	private String fhType;
	private String rtype;
	private Date ctime;
	private String other5;
	private String orgId;
	private String xzqhdm;

	public String getOther1() {
		return other1;
	}

	public void setOther1(String other1) {
		this.other1 = other1;
	}

	public String getOther2() {
		return other2;
	}

	public void setOther2(String other2) {
		this.other2 = other2;
	}

	public String getOther3() {
		return other3;
	}

	public void setOther3(String other3) {
		this.other3 = other3;
	}

	public String getOther4() {
		return other4;
	}

	public void setOther4(String other4) {
		this.other4 = other4;
	}

	public String getJtbm() {
		return jtbm;
	}

	public void setJtbm(String jtbm) {
		this.jtbm = jtbm;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getFhBm() {
		return fhBm;
	}

	public void setFhBm(String fhBm) {
		this.fhBm = fhBm;
	}

	public String getFhZjh() {
		return fhZjh;
	}

	public void setFhZjh(String fhZjh) {
		this.fhZjh = fhZjh;
	}

	public String getFhAddr() {
		return fhAddr;
	}

	public void setFhAddr(String fhAddr) {
		this.fhAddr = fhAddr;
	}

	public String getFhMj() {
		return fhMj;
	}

	public void setFhMj(String fhMj) {
		this.fhMj = fhMj;
	}

	public String getFhSyr() {
		return fhSyr;
	}

	public void setFhSyr(String fhSyr) {
		this.fhSyr = fhSyr;
	}

	public String getFhSyridno() {
		return fhSyridno;
	}

	public void setFhSyridno(String fhSyridno) {
		this.fhSyridno = fhSyridno;
	}

	public String getFhKind() {
		return fhKind;
	}

	public void setFhKind(String fhKind) {
		this.fhKind = fhKind;
	}

	public String getFhType() {
		return fhType;
	}

	public void setFhType(String fhType) {
		this.fhType = fhType;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public String getOther5() {
		return other5;
	}

	public void setOther5(String other5) {
		this.other5 = other5;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getXzqhdm() {
		return xzqhdm;
	}

	public void setXzqhdm(String xzqhdm) {
		this.xzqhdm = xzqhdm;
	}
	public String rn;
	
	/*
	 * JTBM22020102010348家庭编码 IDNO22020219320426092X身份证号 MEMBERNAME齐玉荣人员姓名
	 * FH_BM45139 房屋编码 FH_ZJHS220002141房产证号 FH_ADDR吉林市昌邑区新地号街道辽东社区18-3-201坐落地址
	 * FH_MJ67.81面积 FH_SYR 齐玉荣 房产所有人 FH_SYRIDNO房产所有人身份证号 FH_KIND自有私产住房1 商品房 2 公租房 3
	 * 廉租房 -1 无 FH_TYPE楼房1 自有 2 租住 3 借住 RTYPE城市低保对象1 低保户 2 边缘户 3 低收入 4 特困人员 5 普通对象
	 * CTIME2017/10/23 10:27:02创建时间 OTHER1ocs数据来源 OTHER251539家庭表主键 OTHER3121246人员表主键
	 * OTHER445139 房屋表主键 OTHER5 齐玉荣 ## 齐玉荣 ##本人备注字段 ORG_ID2202010201机构id
	 * XZQHDM2202010201行政区划代码
	 */

	public String getRn() {
		return rn;
	}

	public void setRn(String rn) {
		this.rn = rn;
	}

	@Override
	public GrBaseinfo mapRow(ResultSet rs, int i) throws SQLException {
		GrBaseinfo e = new GrBaseinfo();
		e.setJtbm(rs.getString("JTBM"));
		e.setIdno(rs.getString("IDNO"));
		e.setMembername(rs.getString("MEMBERNAME"));
		e.setFhBm(rs.getString("FH_BM"));
		e.setFhZjh(rs.getString("FH_ZJH"));
		e.setFhAddr(rs.getString("FH_ADDR"));
		e.setFhMj(rs.getString("FH_MJ"));
		e.setFhSyr(rs.getString("FH_SYR"));
		e.setFhSyridno(rs.getString("FH_SYRIDNO"));
		e.setFhKind(rs.getString("FH_KIND"));
		e.setFhType(rs.getString("FH_TYPE"));
		e.setRtype(rs.getString("RTYPE"));
		e.setCtime(rs.getDate("CTIME"));
		e.setOther1(rs.getString("OTHER1"));
		e.setOther2(rs.getString("OTHER2"));
		e.setOther3(rs.getString("OTHER3"));
		e.setOther4(rs.getString("OTHER4"));
		e.setOther5(rs.getString("OTHER5"));
		e.setOrgId(rs.getString("ORG_ID"));
		e.setXzqhdm(rs.getString("XZQHDM"));
		return e;

	}

}
