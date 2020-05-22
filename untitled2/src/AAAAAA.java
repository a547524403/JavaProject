package com.cmcc.umapi.query;

import junit.framework.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cmcc.ucm.utils.DbNoUtil;
import com.cmcc.ucm.utils.PARAMETER;
import com.cmcc.usapi.utils.HttpTool;
import com.cmcc.usapi.utils.ResObj;

/**
 * um΢����
 * �ܱ�У��
 * /query/XXXXXXXXX
 * @author zsf
 * 2019/04/15
 */

public class AAAAAA {
	

	private static String url = PARAMETER.answerValidate;
	private String passid = PARAMETER.passid;
	
	public static ResObj answerValidate(String sourceid,String appType,String msgid,String version
			,String passid,String questionId,String questionAnswer) throws Exception{
		@SuppressWarnings("rawtypes")
		HttpTool httpTool = new HttpTool();
		JSONObject json = new JSONObject();
		
		json.put("sourceid", sourceid);
		json.put("appType", appType);
		json.put("msgid", msgid);
		json.put("version", version);
		json.put("passid", passid);
		json.put("questionId", questionId);
		json.put("questionAnswer", questionAnswer);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("����json��" + json);
		String res = httpTool.postSend(url, json);
		ResObj resObj = JSON.parseObject(res,ResObj.class);
		return resObj;
	}
	
	//��������, 1. ����passid��ѯuserid; 2. ����userid��ѯumc_passid_passwd_answer ��ȡ�����3��
	@Test(groups = "group1")
	public void success_00() throws Exception{
		DbNoUtil.dbNo("a2056495458");  //�鿴�ֻ�����ķֿ��
		ResObj res = answerValidate("3","1","abcd","1.0",passid,"2713775","��һ");
		Assert.assertEquals("2000", res.getResultCode());
	}
	@Test
	public void success_01() throws Exception{
		DbNoUtil.dbNo("a2056495458");  //�鿴�ֻ�����ķֿ��
		ResObj res = answerValidate("3","1","abcd","1.0",passid,"2713776","����");
		Assert.assertEquals("2000", res.getResultCode());
	}
	@Test
	public void success_02() throws Exception{
		DbNoUtil.dbNo("a2056495458");  //�鿴�ֻ�����ķֿ��
		ResObj res = answerValidate("3","1","abcd","1.0",passid,"2713777","�㽭ʡ������");
		Assert.assertEquals("2000", res.getResultCode());
	}
	//�쳣����
	//passid�쳣
	@DataProvider(name="passidError")
	public  Object[][] passidError(){
		return new Object[][]{
		{"","2713775","��һ","1404"},    		//passid error
		{null,"2713775","��һ","1404"},   		//passid error
		{passid,"","��һ","1404"},  //questionId error
		{passid,null,"��һ","1404"},  //questionId error
		{passid,"2713775","","1404"},  //questionAnswer error
		{passid,"2713775",null,"1404"},  //questionAnswer error
		{"11111111","2713775","��һ","1101"},  //�û�δע��
		{"142259005","2713775","��һ","1351"},  //��ע�ᣬ���ܱ�
		{passid,"2713775","xiaoxiao","1352"},  //���ܱ����𰸴���
		};
	}
	@Test(dataProvider = "passidError")
	public void accountError_01(String passid,String questionId,String questionAnswer,String resultCode) throws Exception{
		ResObj res = answerValidate("3","1","abcd","1.0",passid,questionId,questionAnswer);
		Assert.assertEquals(resultCode, res.getResultCode());
	}
	
	//sourceid�쳣
	@DataProvider(name="sourceid")
	public  Object[][] sourceid(){
		return new Object[][]{
		{""},    		//��
		{null},   		//null
		};
	}
	@Test(dataProvider = "sourceid")
	public void paraError_01(String sourceid) throws Exception{
		ResObj res = answerValidate(sourceid,"1","abcd","1.0",passid,"1132616","xiaoxiao");
		Assert.assertEquals("1404", res.getResultCode());
	}
	
	//appType�쳣
	@DataProvider(name="appType")
	public  Object[][] appType(){
		return new Object[][]{
		{""},    		//��
		{null},   		//null
		};
	}
	@Test(dataProvider = "appType")
	public void paraError_02(String appType) throws Exception{
		ResObj res = answerValidate("3",appType,"abcd","1.0",passid,"1132616","xiaoxiao");
		Assert.assertEquals("1404", res.getResultCode());
	}
	
	//msgid�쳣
	@DataProvider(name="msgid")
	public  Object[][] msgid(){
		return new Object[][]{
		{""},    		//��
		{null},   		//null
		{"abcdefghijabcdefghijabcdefghijabcdefghij"},   		//����36λ
		};
	}
	@Test(dataProvider = "msgid")
	public void paraError_03(String msgid) throws Exception{
		ResObj res = answerValidate("3","1",msgid,"1.0",passid,"1132616","xiaoxiao");
		Assert.assertEquals("1404", res.getResultCode());
	}
	
	//version�쳣
	@DataProvider(name="version")
	public  Object[][] version(){
		return new Object[][]{
		{""},    		//��
		{null},   		//null
		};
	}
	@Test(dataProvider = "version")
	public void paraError_04(String version) throws Exception{
		ResObj res = answerValidate("3","1","abcd",version,passid,"1132616","xiaoxiao");
		Assert.assertEquals("1404", res.getResultCode());
	}
