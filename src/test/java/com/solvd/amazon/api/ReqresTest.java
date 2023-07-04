//package com.solvd.amazon.api;
//
//import com.qaprosoft.carina.core.foundation.IAbstractTest;
//import com.qaprosoft.carina.demo.api.solvd.GetUserMethod;
//import com.qaprosoft.carina.demo.api.solvd.PostUserMethod;
//import org.testng.annotations.Test;
//
//public class ReqresTest implements IAbstractTest {
//
//    @Test()
//    public void getUserTest(){
//        GetUserMethod getUserMethod = new GetUserMethod();
//        getUserMethod.callAPIExpectSuccess();
//        getUserMethod.validateResponse();
//        getUserMethod.validateResponseAgainstSchema("api/users/_get/reqresUsers.schema");
//    }
//
//    @Test()
//    public void createUser(){
//        PostUserMethod postUserMethod = new PostUserMethod();
//        postUserMethod.callAPI();
//        postUserMethod.validateResponse();
//    }
//
//}
