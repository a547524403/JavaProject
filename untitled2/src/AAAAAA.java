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
 * um微服务
 * 密保校验
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
		System.out.println("请求json：" + json);
		String res = httpTool.postSend(url, json);
		ResObj resObj = JSON.parseObject(res,ResObj.class);
		return resObj;
	}
	
	//正常用例, 1. 根据passid查询userid; 2. 根据userid查询umc_passid_passwd_answer 表取出最近3条
	@Test(groups = "group1")
	public void success_00() throws Exception{
		DbNoUtil.dbNo("a2056495458");  //查看手机号码的分库表
		ResObj res = answerValidate("3","1","abcd","1.0",passid,"2713775","刘一");
		Assert.assertEquals("2000", res.getResultCode());
	}
	@Test
	public void success_01() throws Exception{
		DbNoUtil.dbNo("a2056495458");  //查看手机号码的分库表
		ResObj res = answerValidate("3","1","abcd","1.0",passid,"2713776","刘二");
		Assert.assertEquals("2000", res.getResultCode());
	}
	@Test
	public void success_02() throws Exception{
		DbNoUtil.dbNo("a2056495458");  //查看手机号码的分库表
		ResObj res = answerValidate("3","1","abcd","1.0",passid,"2713777","浙江省杭州市");
		Assert.assertEquals("2000", res.getResultCode());
	}
	//异常用例
	//passid异常
	@DataProvider(name="passidError")
	public  Object[][] passidError(){
		return new Object[][]{
		{"","2713775","刘一","1404"},    		//passid error
		{null,"2713775","刘一","1404"},   		//passid error
		{passid,"","刘一","1404"},  //questionId error
		{passid,null,"刘一","1404"},  //questionId error
		{passid,"2713775","","1404"},  //questionAnswer error
		{passid,"2713775",null,"1404"},  //questionAnswer error
		{"11111111","2713775","刘一","1101"},  //用户未注册
		{"142259005","2713775","刘一","1351"},  //已注册，无密保
		{passid,"2713775","xiaoxiao","1352"},  //有密保，答案错误
		};
	}
	@Test(dataProvider = "passidError")
	public void accountError_01(String passid,String questionId,String questionAnswer,String resultCode) throws Exception{
		ResObj res = answerValidate("3","1","abcd","1.0",passid,questionId,questionAnswer);
		Assert.assertEquals(resultCode, res.getResultCode());
	}
	
	//sourceid异常
	@DataProvider(name="sourceid")
	public  Object[][] sourceid(){
		return new Object[][]{
		{""},    		//空
		{null},   		//null
		};
	}
	@Test(dataProvider = "sourceid")
	public void paraError_01(String sourceid) throws Exception{
		ResObj res = answerValidate(sourceid,"1","abcd","1.0",passid,"1132616","xiaoxiao");
		Assert.assertEquals("1404", res.getResultCode());
	}
	
	//appType异常
	@DataProvider(name="appType")
	public  Object[][] appType(){
		return new Object[][]{
		{""},    		//空
		{null},   		//null
		};
	}
	@Test(dataProvider = "appType")
	public void paraError_02(String appType) throws Exception{
		ResObj res = answerValidate("3",appType,"abcd","1.0",passid,"1132616","xiaoxiao");
		Assert.assertEquals("1404", res.getResultCode());
	}
	
	//msgid异常
	@DataProvider(name="msgid")
	public  Object[][] msgid(){
		return new Object[][]{
		{""},    		//空
		{null},   		//null
		{"abcdefghijabcdefghijabcdefghijabcdefghij"},   		//大于36位
		};
	}
	@Test(dataProvider = "msgid")
	public void paraError_03(String msgid) throws Exception{
		ResObj res = answerValidate("3","1",msgid,"1.0",passid,"1132616","xiaoxiao");
		Assert.assertEquals("1404", res.getResultCode());
	}
	
	//version异常
	@DataProvider(name="version")
	public  Object[][] version(){
		return new Object[][]{
		{""},    		//空
		{null},   		//null
		};
	}
	@Test(dataProvider = "version")
	public void paraError_04(String version) throws Exception{
		ResObj res = answerValidate("3","1","abcd",version,passid,"1132616","xiaoxiao");
		Assert.assertEquals("1404", res.getResultCode());
	}
