package com.lanou.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zar on 2017/10/13.
 */
public class GenTest {
    public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        File configFile = new File("src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) {
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        System.out.println("kkkk");
        File configFile = new File("src/main/resources/generatorConfig.xml");
        List<String> warnings = new ArrayList<String>();
        List<String> warnings1 = new ArrayList<String>();
        List<String> warnings2 = new ArrayList<String>();
        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            GenTest genTest = new GenTest();
            System.out.println("1123123123");
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            GenTest genTest = new GenTest();
            genTest.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
