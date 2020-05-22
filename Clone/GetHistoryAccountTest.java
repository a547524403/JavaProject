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
 * �һ���ʷͨ��֤
 * /query/getHistoryAccount
 * �漰���ж��˺�Ϊ�ֻ������ѯUMC_MOBILE_BIND_LIST�����������ù���ͨ��֤�ţ��ж��˺�Ϊ�������ѯUMC_EMAIL_BIND_LIST�����������ù���ͨ��֤��
 * @author zsf
 * 2019/04/12
 **/
public class GetHistoryAccountTest {
	
	private static String url = PARAMETER.getHistoryAccount;
	private String mobile = PARAMETER.mobile;//�ƶ�
	private String email = PARAMETER.email;
	
	public static ResObj GetHistoryAccount(String sourceid,String appType,String msgid,String version
			,String account) throws Exception{
		@SuppressWarnings("rawtypes")
		HttpTool httpTool = new HttpTool();
		JSONObject json = new JSONObject();
		
		json.put("sourceid", sourceid);
		json.put("appType", appType);
		json.put("msgid", msgid);
		json.put("version", version);
		json.put("account", account);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("����json��" + json);
		String res = httpTool.postSend(url, json);
		ResObj resObj = JSON.parseObject(res,ResObj.class);
		return resObj;
	}
	
	//��������,�ֻ����룬��ѯUMC_MOBILE_BIND_LIST��
	@Test(groups = "group1")
	public void success_00() throws Exception{
		DbNoUtil.dbNo(mobile);  //�鿴�ֻ�����ķֿ��
		ResObj res = GetHistoryAccount("3","1","abcd","1.0",mobile);
		Assert.assertEquals("2000", res.getResultCode());
	}
	
	//��������,���䣬��ѯUMC_EMAIL_BIND_LIST��  --�޽�3��ļ�¼
	@Test(groups = "group1")
	public void success_01() throws Exception{
		DbNoUtil.dbNo(email);  //�鿴�ֻ�����ķֿ��
		ResObj res = GetHistoryAccount("3","1","abcd","1.0",email);
		Assert.assertEquals("2000", res.getResultCode());
	}
	
	
	//�쳣����
	//account�쳣
	//#�ֻ��Ŷ� msisdn.range=13,145,147,149,15,166,170,1718,1719,172,173,174,175,176,177,178,18,198,199
	//���䣺^([a-zA-Z0-9\\_\\-\\.])+@([a-zA-Z0-9\\_\\-\\.])+(\\.([a-zA-Z0-9])+)+$
	@DataProvider(name="accountError")
	public  Object[][] accountError(){
		return new Object[][]{
		{"","1404"},    		//��
		{null,"1404"},   		//null
		{"11822995521","1404"},
		{"188671012","1404"},  //λ������
		{"zhangzhihonghz@163.com","1351"},
		{"188ab6710cd","1404"},
		{"111222333444139.com","1404"},   	
		};
	}
	@Test(dataProvider = "accountError")
	public void accountError_01(String account,String resultCode) throws Exception{
		ResObj res = GetHistoryAccount("3","1","abcd","1.0",account);
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
		ResObj res = GetHistoryAccount(sourceid,"1","abcd","1.0",mobile);
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
		ResObj res = GetHistoryAccount("3",appType,"abcd","1.0",mobile);
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
		ResObj res = GetHistoryAccount("3","1",msgid,"1.0",mobile);
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
		ResObj res = GetHistoryAccount("3","1","abcd",version,mobile);
		Assert.assertEquals("1404", res.getResultCode());
	}
	
}
