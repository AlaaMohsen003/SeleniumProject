package Fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests  extends BaseTests {
    @Test
    public void testFileUpload(){
        String absolutePath ="C:\\Users\\Lenovo\\IdeaProjects\\SeleniumProject\\resources\\";
      String filename="aaa.txt";
        var fileUploadPage=homePage.clickFileUpload() ;
        fileUploadPage.uploadFile(absolutePath+filename);
       assertEquals (fileUploadPage.getUploadedFileName(),filename,"The file name is correct");

    }


}
