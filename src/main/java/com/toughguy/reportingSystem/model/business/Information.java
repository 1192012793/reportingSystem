package com.toughguy.reportingSystem.model.business;

import java.awt.TextArea;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.toughguy.reportingSystem.model.AbstractModel;

/**
 * 举报信息实体类
 * @author BOBO
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL) //为空字段不返回
public class Information extends AbstractModel{
	
	private int id;
	private int threadArea; //线报地域(县/区id)
	private String clueAddress; //线报详址
	private String industryField; //行业领域
	private String informType;  //举报类别
	private String informContent;  //举报内容
	private String picture;   //图片
	private String video;    //视频
	private int state;     //案件状态   -1待审核   1已接案  2侦办中  3已结案   4未结案
	private int informerId;   //举报人id
	private int validAssessorId;   //审核员(已接案)(当前用户id)
	private String validFile;    //案件附件（已接案的）
	private String investigationFile;    //案件附件（侦办中的）
	private String feedbackInformation;     //反馈信息
	private int investigationAssessorId;  //审核员（侦办中）(当前用户id)
	private int endAssessorId;  //审核员（已结束）(当前用户id)
	private String openId;  //如果是匿名则保持openId
	
	private String phoneNumber; //举报人手机号（页面使用）
	private String encryptPhoneNumber; //加密手机号
	private String validAssessor; //审核员（页面使用）(已接案)
	private String investigationAssessor; //审核员（页面使用）(侦办中)
	private String endAssessor; //审核员（页面使用）(已结束)
	
	private String GJZZAQNumber;	//1.国家政治安全（前台）
	private String JCZQNumber;		//2.基层政权（前台）
	private String ZZSLCBNumber;    //3.宗族势力、村霸（前台）
	private String ZDCQNumber;		//4.征地、拆迁（前台）
	private String JSGCNumber;		//5.建设工程、运输、矿产、渔业（前台）
	private String QXBSNumber;		//6.欺行霸市（前台）
	private String HDDNumber;		//7.黄赌毒
	private String FFGLFDNumber;	//8.非法高利放贷、暴力讨债
	private String CSMJJFNumber;	//9.插手民间纠纷
	private String JWHSHNumber;		//10.境外黑社会
	
	private String alarmNumber;      //报警单号
	private int acceptUnits;      //受理单位(区县id)
	private String reportWay;        //举报方式
	private Date acceptTime;       //受理时间
	private String receiverAgree;    //受理人员意见
	private String dutyleadAgree;    //值班领导意见
	private String sweepblackAgree;  //扫黑办意见
	private String tingleadAgree;    //厅领导意见
	private String classleadAgree;   //带班领导
	private String watch;            //值班员
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getThreadArea() {
		return threadArea;
	}
	public void setThreadArea(int threadArea) {
		this.threadArea = threadArea;
	}
	public String getClueAddress() {
		return clueAddress;
	}
	public void setClueAddress(String clueAddress) {
		this.clueAddress = clueAddress;
	}
	public String getIndustryField() {
		return industryField;
	}
	public void setIndustryField(String industryField) {
		this.industryField = industryField;
	}
	public String getInformType() {
		return informType;
	}
	public void setInformType(String informType) {
		this.informType = informType;
	}
	public String getInformContent() {
		return informContent;
	}
	public void setInformContent(String informContent) {
		this.informContent = informContent;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getAlarmNumber() {
		return alarmNumber;
	}
	public void setAlarmNumber(String alarmNumber) {
		this.alarmNumber = alarmNumber;
	}
	public int getAcceptUnits() {
		return acceptUnits;
	}
	public void setAcceptUnits(int acceptUnits) {
		this.acceptUnits = acceptUnits;
	}
	public String getReportWay() {
		return reportWay;
	}
	public void setReportWay(String reportWay) {
		this.reportWay = reportWay;
	}
	public Date getAcceptTime() {
		return acceptTime;
	}
	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}
	public String getReceiverAgree() {
		return receiverAgree;
	}
	public void setReceiverAgree(String receiverAgree) {
		this.receiverAgree = receiverAgree;
	}
	public String getDutyleadAgree() {
		return dutyleadAgree;
	}
	public void setDutyleadAgree(String dutyleadAgree) {
		this.dutyleadAgree = dutyleadAgree;
	}
	public String getSweepblackAgree() {
		return sweepblackAgree;
	}
	public void setSweepblackAgree(String sweepblackAgree) {
		this.sweepblackAgree = sweepblackAgree;
	}
	public String getTingleadAgree() {
		return tingleadAgree;
	}
	public void setTingleadAgree(String tingleadAgree) {
		this.tingleadAgree = tingleadAgree;
	}
	public String getClassleadAgree() {
		return classleadAgree;
	}
	public void setClassleadAgree(String classleadAgree) {
		this.classleadAgree = classleadAgree;
	}
	public String getWatch() {
		return watch;
	}
	public void setWatch(String watch) {
		this.watch = watch;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	
	public int getInformerId() {
		return informerId;
	}
	public void setInformerId(int informerId) {
		this.informerId = informerId;
	}

	public int getValidAssessorId() {
		return validAssessorId;
	}
	public void setValidAssessorId(int validAssessorId) {
		this.validAssessorId = validAssessorId;
	}
	public int getInvestigationAssessorId() {
		return investigationAssessorId;
	}
	public void setInvestigationAssessorId(int investigationAssessorId) {
		this.investigationAssessorId = investigationAssessorId;
	}
	public String getValidFile() {
		return validFile;
	}
	public void setValidFile(String validFile) {
		this.validFile = validFile;
	}
	public String getInvestigationFile() {
		return investigationFile;
	}
	public void setInvestigationFile(String investigationFile) {
		this.investigationFile = investigationFile;
	}
	
	public String getFeedbackInformation() {
		return feedbackInformation;
	}
	public void setFeedbackInformation(String feedbackInformation) {
		this.feedbackInformation = feedbackInformation;
	}
	
	public String getEncryptPhoneNumber() {
		return encryptPhoneNumber;
	}
	public void setEncryptPhoneNumber(String encryptPhoneNumber) {
		this.encryptPhoneNumber = encryptPhoneNumber;
	}
	public String getValidAssessor() {
		return validAssessor;
	}
	public void setValidAssessor(String validAssessor) {
		this.validAssessor = validAssessor;
	}
	public String getInvestigationAssessor() {
		return investigationAssessor;
	}
	public void setInvestigationAssessor(String investigationAssessor) {
		this.investigationAssessor = investigationAssessor;
	}
	public int getEndAssessorId() {
		return endAssessorId;
	}
	public void setEndAssessorId(int endAssessorId) {
		this.endAssessorId = endAssessorId;
	}
	public String getEndAssessor() {
		return endAssessor;
	}
	public void setEndAssessor(String endAssessor) {
		this.endAssessor = endAssessor;
	}
	public String getGJZZAQNumber() {
		return GJZZAQNumber;
	}
	public void setGJZZAQNumber(String gJZZAQNumber) {
		GJZZAQNumber = gJZZAQNumber;
	}
	public String getJCZQNumber() {
		return JCZQNumber;
	}
	public void setJCZQNumber(String jCZQNumber) {
		JCZQNumber = jCZQNumber;
	}
	public String getZZSLCBNumber() {
		return ZZSLCBNumber;
	}
	public void setZZSLCBNumber(String zZSLCBNumber) {
		ZZSLCBNumber = zZSLCBNumber;
	}
	public String getZDCQNumber() {
		return ZDCQNumber;
	}
	public void setZDCQNumber(String zDCQNumber) {
		ZDCQNumber = zDCQNumber;
	}
	public String getJSGCNumber() {
		return JSGCNumber;
	}
	public void setJSGCNumber(String jSGCNumber) {
		JSGCNumber = jSGCNumber;
	}
	public String getQXBSNumber() {
		return QXBSNumber;
	}
	public void setQXBSNumber(String qXBSNumber) {
		QXBSNumber = qXBSNumber;
	}
	public String getHDDNumber() {
		return HDDNumber;
	}
	public void setHDDNumber(String hDDNumber) {
		HDDNumber = hDDNumber;
	}
	public String getFFGLFDNumber() {
		return FFGLFDNumber;
	}
	public void setFFGLFDNumber(String fFGLFDNumber) {
		FFGLFDNumber = fFGLFDNumber;
	}
	public String getCSMJJFNumber() {
		return CSMJJFNumber;
	}
	public void setCSMJJFNumber(String cSMJJFNumber) {
		CSMJJFNumber = cSMJJFNumber;
	}
	public String getJWHSHNumber() {
		return JWHSHNumber;
	}
	public void setJWHSHNumber(String jWHSHNumber) {
		JWHSHNumber = jWHSHNumber;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
