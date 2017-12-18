/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.util.Random;

/**
 * 验证字符串格式
 *
 * @author lin xiangpeng
 */
public class StringUtil {

    //1非空验证
    public static boolean checkLength(String s) {
        if (s.length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    //数字验证
    public static boolean checkDigit(String s) {
        String regex = "[0-9]+";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //小数验证
    public static boolean checkDecimal(String s) {
        String regex = "([0-9]*.[0-9]+)|([0-9]+)";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //电话验证
    public static boolean checkPhone(String s) {
        String regex = "[0-9]{8}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //手机验证
    public static boolean checkTel(String s) {
        String regex = "[0-9]{11}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //邮编验证
    public static boolean checkPostcode(String s) {
        String regex = "[0-9]{6}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //QQ验证
    public static boolean checkQQ(String s) {
        String regex = "[0-9]{5,12}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //传真验证
    public static boolean checkFax(String s) {
        String regex = "[0-9]{3,4}-[0-9]{8}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //用户名验证
    public static boolean checkUsername(String s) {
        String regex = "[0-9a-zA-Z]{8,20}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //密码验证
    public static boolean checkPassword(String s) {
        String regex = "[0-9a-zA-Z]{6,16}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //年份验证
    public static boolean checkYear(String s) {
        String regex = "[0-9]{4}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //中文名称验证
    public static boolean checkName(String s) {
        String regex = "[\u4e00-\u9fa5]{2,4}";
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    //验证码
    public static String getCode() {
        //1随机生成0-9的数字，组成字符串
        char[] codesrc = new char[62];
        char ch = 'a';
        char ch2 = 'A';
        char no = '0';
        for (int i = 0; i < 10; i++) {
            codesrc[i] = no++;//赋数字
        }
        for (int i = 10; i < 36; i++) {
            codesrc[i] = ch++;//小写字母
        }
        for (int i = 36; i < 62; i++) {
            codesrc[i] = ch2++;//大写字母
        }
        Random rd = new Random();
        StringBuffer bf = new StringBuffer();
        for (int i = 1; i <= 4; i++) {
            //随机生成下标
            int index = rd.nextInt(62);
            bf.append(codesrc[index]);
        }
        //2保存生成的字符串（相当于保存到session）
        String vcode = bf.toString();
        return vcode;
    }
}
