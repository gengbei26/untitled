package com.简单工厂;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.InterfaceAddress;
import java.util.Properties;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author deus
 * @Data 2018/8/14 17:09
 * @Version 1.0
 **/
public class Factory {
    //简单工厂
    public static Api CreateApi(int condition){
        Api api = null;
        if(condition == 1){
            api = new ImplA();
        }else if(condition == 2){
            api = new ImplB();
        }
        return api;
    }
    //反射工厂，读取配置文件创建对象
    public static Api CreateApi(){
        Properties p = new Properties();
        InputStreamReader in = null;
        try{
            in = new InputStreamReader(Factory.class.getResourceAsStream("FactoryTest.properties"),"UTF-8");
            p.load(in);
        }
        catch (IOException e){
            System.out.println("装载工厂配置文件出错了");
            e.printStackTrace();
        }
        finally {
            try{
                in.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        Api api = null;
        try{
            api = (Api) Class.forName(p.getProperty("ImplClass")).getConstructor().newInstance();
            //api = (Api)Class.forName("ImplA").getConstructor().newInstance();
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }
        return api;
    }
}
