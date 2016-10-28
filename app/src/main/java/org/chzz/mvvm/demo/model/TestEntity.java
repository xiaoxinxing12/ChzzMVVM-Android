package org.chzz.mvvm.demo.model;

/**
 * ============================================================
 * 版权 ：深圳市医友智能技术有限公司 版权所有 (c)   2016/10/28
 * 作者:copy   xiaoxinxing12@qq.com
 * 版本 ：1.0
 * 创建日期 ： 2016/10/28--13:42
 * 描述 ：
 * 修订历史 ：
 * ============================================================
 **/

public class TestEntity {
    public TestEntity(String address, String dec, String number, String title) {
        this.address = address;
        this.dec = dec;
        this.number = number;
        this.title = title;
    }

    private String title;
    private String dec;
    private String address;
    private String number;
    private TestEntity testEntity;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
