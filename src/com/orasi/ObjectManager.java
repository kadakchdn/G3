
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.facebook.com
    Add a description of www.facebook.com
    */
    /* Page: Facebook  log in or sign up 
    
    */

    

bC = new ByFactoryCollection("email", "32593.912", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "32593.914", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "32593.916", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy']", "AttributeRule", "32593.918", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy']", "AttributeRule", "32593.920", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-email']", "AttributeRule", "32593.922", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-email']", "AttributeRule", "32593.924", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Email address or phone number']", "AttributeRule", "32593.926", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Email address or phone number']", "AttributeRule", "32593.928", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autofocus='1']", "AttributeRule", "32593.930", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autofocus='1']", "AttributeRule", "32593.932", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Email address or phone number']", "AttributeRule", "32593.934", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Email address or phone number']", "AttributeRule", "32593.936", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"email\"]", "IDRule", "32593.938", "" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "32593.940", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "32593.942", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"email\"]", "NameRule", "32593.944", "" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "32593.946", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "32593.948", "" ) );


objectMap.put( "32593.912", bC );


bC = new ByFactoryCollection("pass", "32593.952", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "32593.954", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "32593.956", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32593.958", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32593.960", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-pass']", "AttributeRule", "32593.962", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-pass']", "AttributeRule", "32593.964", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Password']", "AttributeRule", "32593.966", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Password']", "AttributeRule", "32593.968", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Password']", "AttributeRule", "32593.970", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Password']", "AttributeRule", "32593.972", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"pass\"]", "IDRule", "32593.974", "" ) );
bC.add( new ByFactory( ById.class, "pass", "IDRule", "32593.976", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"pass\"]", "IDRule", "32593.978", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"pass\"]", "NameRule", "32593.980", "" ) );
bC.add( new ByFactory( ByName.class, "pass", "NameRule", "32593.982", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"pass\"]", "NameRule", "32593.984", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32593.986", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32593.988", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32593.990", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32593.992", "" ) );


objectMap.put( "32593.952", bC );


bC = new ByFactoryCollection("login", "32593.996", "");
bC.add( new ByFactory( ByXPath.class, "//button[@type='submit']", "AttributeRule", "32593.998", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "32593.1000", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']", "AttributeRule", "32593.1002", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']", "AttributeRule", "32593.1004", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@data-testid='royal-login-button']", "AttributeRule", "32593.1006", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-login-button']", "AttributeRule", "32593.1008", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@value='1']", "AttributeRule", "32593.1010", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='1']", "AttributeRule", "32593.1012", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"u_0_5_tS\"]", "IDRule", "32593.1014", "" ) );
bC.add( new ByFactory( ById.class, "u_0_5_tS", "IDRule", "32593.1016", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"u_0_5_tS\"]", "IDRule", "32593.1018", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@name=\"login\"]", "NameRule", "32593.1020", "" ) );
bC.add( new ByFactory( ByName.class, "login", "NameRule", "32593.1022", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"login\"]", "NameRule", "32593.1024", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@class='_9vtf']/div[2]/button[1]", "ParentRule[AttributeRule]", "32593.1026", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_9vtf']/div[2]/button[1]", "ParentRule[AttributeRule]", "32593.1028", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@data-testid='royal_login_form']/div[2]/button[1]", "ParentRule[AttributeRule]", "32593.1030", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal_login_form']/div[2]/button[1]", "ParentRule[AttributeRule]", "32593.1032", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@action='/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzQzNjYxMTk3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next']/div[2]/button[1]", "ParentRule[AttributeRule]", "32593.1034", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzQzNjYxMTk3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next']/div[2]/button[1]", "ParentRule[AttributeRule]", "32593.1036", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@method='post']/div[2]/button[1]", "ParentRule[AttributeRule]", "32593.1038", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@method='post']/div[2]/button[1]", "ParentRule[AttributeRule]", "32593.1040", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@id=\"u_0_2_Gr\"]/div[2]/button[1]", "ParentRule[IDRule]", "32593.1042", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"u_0_2_Gr\"]/div[2]/button[1]", "ParentRule[IDRule]", "32593.1044", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form/div[2]/button[1]", "ParentRule[TagRule]", "32593.1046", "" ) );


objectMap.put( "32593.996", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
